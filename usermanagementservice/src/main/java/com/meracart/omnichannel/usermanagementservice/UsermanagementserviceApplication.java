package com.meracart.omnichannel.usermanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UsermanagementserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermanagementserviceApplication.class, args);
	}

}
