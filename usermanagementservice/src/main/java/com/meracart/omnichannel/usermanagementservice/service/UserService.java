package com.meracart.omnichannel.usermanagementservice.service;

import com.meracart.commonobjects.model.User;


public interface UserService {

	User save(User save);

	User findByUsername(String username);
    
}
