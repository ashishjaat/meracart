package com.meracart.omnichannel.usermanagementservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meracart.commonobjects.model.User;
import com.meracart.omnichannel.usermanagementservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
    public User save(User user) {
        return userRepository.save(user);
    }
	
	@Override
	public User findByUsername(String username) {
		return userRepository.findByUserName(username);
	};

}
