package com.meracart.omnichannel.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.meracart.commonobjects.model.Order;
import com.meracart.omnichannel.orderservice.service.OrderService;

@RestController
@RequestMapping(value="/orders")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(value = "/hello")
	public String getHome() {
	      return "chal gya h sab";
	}
	
	@PostMapping("/book")
	public Order bookOrder(@RequestBody Order order) {
		
		restTemplate.postForObject(null, order, null);
		return orderService.save(order);
	}
}
