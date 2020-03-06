package com.david.appstore.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayServiceApplication.class, args);
	}

}
