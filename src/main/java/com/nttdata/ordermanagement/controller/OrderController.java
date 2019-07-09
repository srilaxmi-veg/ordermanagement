package com.nttdata.ordermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.ordermanagement.service.OrderService;

@RestController
public class OrderController {
@Autowired
OrderService orderService;
	@GetMapping("/order")
	public void getOrder() {
		System.out.println("In Controller");
		orderService.getOrder();
	}
	
}
