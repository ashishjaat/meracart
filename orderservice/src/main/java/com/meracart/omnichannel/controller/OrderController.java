package com.meracart.omnichannel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.meracart.commonobjects.model.Order;
import com.meracart.omnichannel.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/orders")
	public com.meracart.commonobjects.model.Order bookOrder(@RequestBody Order order) {
		
		restTemplate.postForObject(null, order, null);
		return orderService.save(order);
	}
}
