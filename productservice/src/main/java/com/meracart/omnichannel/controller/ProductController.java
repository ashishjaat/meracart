package com.meracart.omnichannel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meracart.omnichannel.model.Product;
import com.meracart.omnichannel.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/products")
	public Product bookOrder(@RequestBody Product order) {
		return productService.save(order);
	}
}