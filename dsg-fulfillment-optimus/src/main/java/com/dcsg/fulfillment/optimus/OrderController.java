package com.dcsg.fulfillment.optimus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcsg.fulfillment.optimus.models.OrderXML;


@RestController
@RequestMapping("/optimus")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Value("${optimus.add-routing-detail.enabled}")
	private boolean addRoutingDetailsEnabled;
	
	
	@PostMapping(path="/addRoutingDetails")
	public ResponseEntity<OrderXML> addRoutingDetails(@RequestBody OrderXML orderXML) {
		
		if (addRoutingDetailsEnabled) {		
			orderService.addRoutingDetails(orderXML);
		}

		return new ResponseEntity<OrderXML>(orderXML, HttpStatus.OK);
	}
}