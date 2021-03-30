package com.meracart.omnichannel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meracart.commonobjects.model.Product;
import com.meracart.omnichannel.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

}
