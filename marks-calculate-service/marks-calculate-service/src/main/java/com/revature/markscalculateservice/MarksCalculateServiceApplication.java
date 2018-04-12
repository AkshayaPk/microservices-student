package com.revature.markscalculateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@RibbonClients
@EnableFeignClients(basePackages="com.revature.markscalculateservice")
public class MarksCalculateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarksCalculateServiceApplication.class, args);
	}
}
