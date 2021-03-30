package com.meracart.omnichannel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meracart.commonobjects.model.Order;
import com.meracart.omnichannel.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepository;
	
	@Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

}
