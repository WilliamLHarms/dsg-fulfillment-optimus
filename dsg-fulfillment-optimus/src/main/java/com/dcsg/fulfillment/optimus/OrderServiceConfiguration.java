package com.dcsg.fulfillment.optimus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderServiceConfiguration {

	private String[] itemHierarchyList;

	public OrderServiceConfiguration(
			@Value("${optimus.add-routing-detail.list-of-ship-alone-hirearchy}") String itemHierarchyConfig) {
		// Parse itemHierarchyConfig, store result in itemHierarchyList
		itemHierarchyList = itemHierarchyConfig.split("\\|");
		
		
	}

	public String[] getItemHierarchyList() {
		return itemHierarchyList;
	}

}
