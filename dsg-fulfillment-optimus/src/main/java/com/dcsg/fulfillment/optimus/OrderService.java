package com.dcsg.fulfillment.optimus;

import java.io.IOException;

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

	public String addRoutingDetails(String orderString) throws IOException {

		ObjectMapper objectMapper = null;
		JsonNode orderNode = null;

		objectMapper = new ObjectMapper();
		orderNode = objectMapper.readTree(orderString);
		JsonNode orderLineNodes = orderNode.get("tXML").get("Message").get("Order").get("OrderLines").get("OrderLine");

		// For each OrderLine
		for (JsonNode orderLineNode : orderLineNodes) {

			//Get ItemName, get item availability
			String itemName = orderLineNode.get("ItemID").textValue();
			ItemAvailability itemAvailability = orderRepository.getItemAvailability(itemName);

			// VDC exclusive check
			if (checkIfVdcExclusiveEnabled) {
				if (itemAvailability.getSupplierGroupQuantity() > itemAvailability.getStoreGroupQuantity()) {
					addOrderLineReferenceField(orderLineNode, "ReferenceField5", "VDCX");
				}
			}

			// DC exclusive check
			if (checkIfDcExclusiveEnabled) {
				if (itemAvailability.getDcGroupQuantity() > itemAvailability.getStoreGroupQuantity()) {
					addOrderLineReferenceField(orderLineNode, "ReferenceField5", "DCX");
				}
			}
		}

		return objectMapper.writeValueAsString(orderNode);
	}

	
	private void addOrderLineReferenceField(JsonNode orderLineNode, String refFieldName, String refFieldValue) {
		// Get ReferenceFieldList
		JsonNode refFieldListNode = orderLineNode.get("ReferenceFieldList");

		// If ReferenceFieldList is null, create new ReferenceFieldList
		if (refFieldListNode == null) {
			ObjectMapper mapper = new ObjectMapper();
			refFieldListNode = mapper.createObjectNode();
		}

		// Add ReferenceField to ReferenceFieldList
		((ObjectNode) refFieldListNode).put(refFieldName, refFieldValue);

		// Add ReferenceFieldList to OrderLine
		((ObjectNode) orderLineNode).set("ReferenceFieldList", refFieldListNode);
	}

}
