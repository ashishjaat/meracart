package com.meracart.omnichannel.usermanagementservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.meracart.commonobjects.model.User;
import com.meracart.omnichannel.usermanagementservice.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/createuser", method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		return userService.save(user);
	}
	
	@RequestMapping(value = "/getuser", method = RequestMethod.GET)
	public User getUser(@RequestParam String username) {
		return userService.findByUsername(username);
	}
	
}
