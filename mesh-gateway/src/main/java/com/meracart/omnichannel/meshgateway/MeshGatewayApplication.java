package com.meracart.omnichannel.meshgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MeshGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeshGatewayApplication.class, args);
	}

}
