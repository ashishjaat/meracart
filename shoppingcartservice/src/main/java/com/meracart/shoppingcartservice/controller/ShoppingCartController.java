package com.meracart.shoppingcartservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/shoppingCart")
public class ShoppingCartController {
	
	@RequestMapping(value = "/createCart", method = RequestMethod.POST)
	public String createCart() {
		final String shoppingCartId = UUID.randomUUID().toString();
		return shoppingCartId;
	}

	/*
	 * @RequestMapping(value = "/shoppingCart/addProduct/{productId}", method =
	 * RequestMethod.POST) public Product
	 * addProductToCart(@PathVariable("productId") Long productId) {
	 * 
	 * return shoppingCart(); }
	 * 
	 * @RequestMapping(value = "/shoppingCart/removeProduct/{productId}", method =
	 * RequestMethod.POST) public ModelAndView
	 * removeProductFromCart(@PathVariable("productId") Long productId) {
	 * 
	 * return shoppingCart(); }
	 */

}
