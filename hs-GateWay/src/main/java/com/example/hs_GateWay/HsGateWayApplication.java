package com.example.hs_GateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class HsGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HsGateWayApplication.class, args);
	}

}
