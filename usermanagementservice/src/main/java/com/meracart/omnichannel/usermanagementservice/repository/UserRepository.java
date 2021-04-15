package com.meracart.omnichannel.usermanagementservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.meracart.commonobjects.model.User;


public interface UserRepository extends MongoRepository<User, Integer> {

	User findByUserName(String username);

}
