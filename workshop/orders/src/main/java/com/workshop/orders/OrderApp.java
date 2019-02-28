package com.workshop.orders;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

import com.workshop.service.ProductService;




@ComponentScan
public class OrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("order.xml");

		applicationContext.start();

		ProductService productService =  applicationContext.getBean("productService", ProductService.class);
	            
	        
		String name = productService.GetProductInfo(2);

		System.out.println(name);

		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
