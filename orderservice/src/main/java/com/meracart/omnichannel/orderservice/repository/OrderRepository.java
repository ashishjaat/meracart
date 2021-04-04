package com.meracart.omnichannel.orderservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.meracart.commonobjects.model.Order;

public interface OrderRepository extends MongoRepository<Order, Integer> {

}
