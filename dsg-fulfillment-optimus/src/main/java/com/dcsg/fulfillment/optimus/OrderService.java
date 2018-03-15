package com.dcsg.fulfillment.optimus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dcsg.fulfillment.optimus.models.OrderLine;
import com.dcsg.fulfillment.optimus.models.OrderXML;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Value("${optimus.add-routing-detail.check-if-vdc-exclusive.enabled}")
	private boolean checkIfVdcExclusiveEnabled;
	@Value("${optimus.add-routing-detail.check-if-dc-exclusive.enabled}")
	private boolean checkIfDcExclusiveEnabled;
	
	
	public void addRoutingDetails(OrderXML orderXML) {
			
		List<OrderLine> orderLines = orderXML.getTXML().getMessage().getOrder().getOrderLines().getOrderLine();	
		
		for (OrderLine orderLine : orderLines) {
			String itemName = orderLine.getItemID();
			ItemAvailability itemAvailability = orderRepository.getItemAvailability(itemName);

			int storeGroupQuantity = itemAvailability.getStoreGroupQuantity();
			int supplierGroupQuantity = itemAvailability.getSupplierGroupQuantity();
			int dcGroupQuantity = itemAvailability.getDcGroupQuantity();
			
			if (checkIfVdcExclusiveEnabled) {
				if (supplierGroupQuantity > storeGroupQuantity) {
					orderLine.setReferenceField5("VDCX");
				}
			}
			if (checkIfDcExclusiveEnabled) {
				if (dcGroupQuantity > storeGroupQuantity) {
					orderLine.setReferenceField5("DCX");
				}
			}		
		}		
	}	
}

