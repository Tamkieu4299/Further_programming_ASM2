package com.asm2.taxisys;

import com.asm2.taxisys.config.AppConfig;
import com.asm2.taxisys.entity.Customer;
import com.asm2.taxisys.service.CustomerService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class TaxisysApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = (CustomerService) context.getBean("customerService");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name = sc.nextLine();

		System.out.println("Enter phone: ");
		String phone = sc.nextLine();

		System.out.println("Enter address: ");
		String address = sc.nextLine();

		Customer customer = new Customer();
		customer.setName("Tam");
		customerService.saveCustomer(customer);
	}

}
