package com.meracart.omnichannel.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meracart.commonobjects.model.Product;
import com.meracart.omnichannel.productservice.service.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/createProduct")
	public Product createProduct(@RequestBody Product product) {
		return productService.save(product);
	}
}
