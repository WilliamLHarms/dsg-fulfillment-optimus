package com.dcsg.fulfillment.optimus;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/optimus")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Value("${optimus.add-routing-detail.enabled}")
	private boolean addRoutingDetailsEnabled;
	
	
	@PostMapping(path="/addRoutingDetails")
	public ResponseEntity<String> addRoutingDetails(@RequestBody String orderString) throws IOException {
		
		if (addRoutingDetailsEnabled) {		
			orderString = orderService.addRoutingDetails(orderString);
		}
		return new ResponseEntity<String>(orderString, HttpStatus.OK);
	}
	
}