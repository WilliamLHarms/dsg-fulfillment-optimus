package com.dcsg.fulfillment.optimus;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Value("${optimus.add-routing-detail.check-if-vdc-exclusive.enabled}")
	private boolean checkIfVdcExclusiveEnabled;
	@Value("${optimus.add-routing-detail.check-if-dc-exclusive.enabled}")
	private boolean checkIfDcExclusiveEnabled;
	@Value("${optimus.add-routing-detail.check-if-ship-alone-by-dept.enabled}")
	private boolean checkIfShipAloneByHirearchy;	
    
  
	@Autowired
	private OrderServiceConfiguration orderServiceConfiguration;
    
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
//@Configuration
//google spring configuration class.
// this is a decorator on a whole new class I crate.  OrderServiceConfig.java

	public String addRoutingDetails(String orderString) throws IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode orderNode = objectMapper.readTree(orderString);
		JsonNode orderLineNodes = orderNode.get("tXML").get("Message").get("Order").get("OrderLines").get("OrderLine");
       
		
		for (JsonNode orderLineNode : orderLineNodes) {

			
			String itemName = orderLineNode.get("ItemID").textValue();
			ItemAvailability itemAvailability = orderRepository.getItemAvailability(itemName);
   
			if (itemAvailability == null) {
				continue;
			}
			
			/* uncomment this to dump out all the decision variables 
			log.debug("\n######################\n" +
					"Working Item: \t" + itemName +"\n" + 
					"This is the itemAvailability: \n" +
					"DC QTY: \t" + itemAvailability.getDcGroupQuantity() + "\n" +
					"VDC QTY: \t"+ itemAvailability.getSupplierGroupQuantity() + "\n" +
					"Store QTY: \t" + itemAvailability.getStoreGroupQuantity() + "\n" +
					"Hirearchy: \t" + itemAvailability.getItemDepartment() + "-" 
					   				+ itemAvailability.getItemSubDepartment() + "-" 
					   				+ itemAvailability.getItemClass() + "-"  
					   				+ itemAvailability.getItemSubClass() +
					 "\n######################"	); 
			*/
			
			
			//ship alone boolean override - if we get a hit on ship alone, skip the other checks because they don't matter.
			boolean isShipAlone = false;
			
			// Ship alone check
			if (checkIfShipAloneByHirearchy) {
				if (isShipAlone(itemAvailability)) {
					addOrderLineReferenceField(orderLineNode, "ReferenceField5", "SA");
					isShipAlone = true;
				}
			
			}
			//log.debug("Ship Alone Check Is: \t" + isShipAlone );
			
			// VDC exclusive check - skip if ship alone
			if (checkIfVdcExclusiveEnabled && isShipAlone == false) {	
				if (isVdcExclusive(itemAvailability)) {
					addOrderLineReferenceField(orderLineNode, "ReferenceField5", "VDCX");
				}
				
			}
			//log.debug("VDC Exclusive Check Is: \t" + isVdcExclusive(itemAvailability) );

			// DC exclusive check - skip if ship alone
			if (checkIfDcExclusiveEnabled  && isShipAlone == false) {
				if (isDcExclusive(itemAvailability)) {
					addOrderLineReferenceField(orderLineNode, "ReferenceField5", "DCX");
				}
				
			}
			//log.debug("DC Exclusive Check Is: \t" + isDcExclusive(itemAvailability));


		}

		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderNode);
	}


	private void addOrderLineReferenceField(JsonNode orderLineNode, String refFieldName, String refFieldValue) {
		JsonNode lineRefFieldsNode = orderLineNode.get("LineReferenceFields");

		if (lineRefFieldsNode == null) {
			ObjectMapper mapper = new ObjectMapper();
			lineRefFieldsNode = mapper.createObjectNode();
		}

		((ObjectNode) lineRefFieldsNode).put(refFieldName, refFieldValue);
		((ObjectNode) orderLineNode).set("LineReferenceFields", lineRefFieldsNode);
	}


	private boolean isVdcExclusive(ItemAvailability itemAvailability) {
		int storeGroupQuantity = itemAvailability.getStoreGroupQuantity();
		int supplierGroupQuantity = itemAvailability.getSupplierGroupQuantity();
		int dcGroupQuantity = itemAvailability.getDcGroupQuantity();

		return (supplierGroupQuantity > 0 
				&& storeGroupQuantity <= 0 
				&& dcGroupQuantity <= 0 
				);
	}

	
	private boolean isDcExclusive(ItemAvailability itemAvailability) {
		int storeGroupQuantity = itemAvailability.getStoreGroupQuantity();
		int supplierGroupQuantity = itemAvailability.getSupplierGroupQuantity();
		int dcGroupQuantity = itemAvailability.getDcGroupQuantity();

		return (dcGroupQuantity > 0 
				&& storeGroupQuantity <= 0 
				&& supplierGroupQuantity <= 0
				);
	}
	
	private boolean isShipAlone(ItemAvailability itemAvailability) {
		

		
		
		//Stuff we get from itemAvailability
		String itemDept 			= itemAvailability.getItemDepartment();
		String itemSubDept			= itemAvailability.getItemSubDepartment();
		String itemClass			= itemAvailability.getItemClass();
		String itemSubClass			= itemAvailability.getItemSubClass();
		
		
		// Concat the order line hirearchy throw in the -'s 
		String orderedItemHirearchy		= itemDept + "-" +  itemSubDept + "-" + itemClass + "-" + itemSubClass;
		
		String[] arrayListOfShipAloneHirearchy = orderServiceConfiguration.getItemHierarchyList();
		
		
		
		boolean itemMatchedHirearchy = false; //start false, never null
		
		//loop through the list of ship alone hirearch., compare to the order item's hirearch.  If we have a hit set the flag to true.
		//  Uncomment for DEBUG: 
		//for(String s : arrayListOfShipAloneHirearchy) log.debug("Eligable Hirearchy To Flag: \t " + s);
		
		for (int i = 0; i < arrayListOfShipAloneHirearchy.length; i++) {
			String hirearchyToCHeck = arrayListOfShipAloneHirearchy[i];
			
			
			
			if (orderedItemHirearchy.startsWith(hirearchyToCHeck)) { 
				itemMatchedHirearchy = true;
			}	
			
		}
		
		return itemMatchedHirearchy;
			
	}
	
	
}
