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

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode orderNode = objectMapper.readTree(orderString);
		JsonNode orderLineNodes = orderNode.get("tXML").get("Message").get("Order").get("OrderLines").get("OrderLine");

		for (JsonNode orderLineNode : orderLineNodes) {

			String itemName = orderLineNode.get("ItemID").textValue();
			ItemAvailability itemAvailability = orderRepository.getItemAvailability(itemName);

			if (itemAvailability == null) {
				continue;
			}

			// VDC exclusive check
			if (checkIfVdcExclusiveEnabled) {
				if (isVdcExclusive(itemAvailability)) {
					addOrderLineReferenceField(orderLineNode, "ReferenceField5", "VDCX");
				}
			}

			// DC exclusive check
			if (checkIfDcExclusiveEnabled) {
				if (isDcExclusive(itemAvailability)) {
					addOrderLineReferenceField(orderLineNode, "ReferenceField5", "DCX");
				}
			}
		}

		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderNode);
	}

	private void addOrderLineReferenceField(JsonNode orderLineNode, String refFieldName, String refFieldValue) {
		JsonNode refFieldListNode = orderLineNode.get("ReferenceFieldList");

		if (refFieldListNode == null) {
			ObjectMapper mapper = new ObjectMapper();
			refFieldListNode = mapper.createObjectNode();
		}

		((ObjectNode) refFieldListNode).put(refFieldName, refFieldValue);
		((ObjectNode) orderLineNode).set("ReferenceFieldList", refFieldListNode);
	}

	private boolean isVdcExclusive(ItemAvailability itemAvailability) {
		int supplierGroupQuantity = itemAvailability.getSupplierGroupQuantity();
		int storeGroupQuantity = itemAvailability.getStoreGroupQuantity();

		if (supplierGroupQuantity > storeGroupQuantity) {
			return true;
		}
		return false;
	}

	private boolean isDcExclusive(ItemAvailability itemAvailability) {
		int dcGroupQuantity = itemAvailability.getDcGroupQuantity();
		int storeGroupQuantity = itemAvailability.getStoreGroupQuantity();

		if (dcGroupQuantity > storeGroupQuantity) {
			return true;
		}
		return false;
	}
}
