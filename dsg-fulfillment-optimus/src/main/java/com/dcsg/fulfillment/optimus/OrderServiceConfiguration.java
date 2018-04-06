package com.dcsg.fulfillment.optimus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderServiceConfiguration {

	@Value("${optimus.add-routing-detail.list-of-ship-alone-hirearchy}")
	private String itemHierarchyConfig;// ="165|310-006|015-001-002|800-001-006-001";

	private String[] itemHierarchyList;

	public OrderServiceConfiguration() {
		// Parse itemHierarchyConfig, store result in itemHierarchyList
		itemHierarchyList = itemHierarchyConfig.split("|");
	}

	public String[] getItemHierarchyList() {
		return itemHierarchyList;
	}


}
