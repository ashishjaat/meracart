package com.meracart.omnichannel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.meracart.omnichannel.model.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
