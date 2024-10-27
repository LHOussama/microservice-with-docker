package com.example.customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;
@EnableFeignClients
@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerService customerRepo, CustomerMapper customerMapper) {
		{
			return args -> {
				List.of("oussama", "yassine","mustapha").forEach(name -> {
					CustomerDto customerDto = new CustomerDto(name, name + "@gmail.com",1L);
					System.out.println(customerRepo.createCustomer(customerDto).toString());
				});
			};
		}
	}
}