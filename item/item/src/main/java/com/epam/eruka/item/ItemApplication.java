package com.epam.eruka.item;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class ItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemApplication.class, args);
	}

	@GetMapping("/getOrder")
	public List<OrderItem> getOrderItem() {
		OrderItem orderItem = new OrderItem();
		orderItem.setProductCode("R456y");
		orderItem.setProductName("Santoor");
		orderItem.setQuantity("3");
		List<OrderItem> Order = new ArrayList<OrderItem>();
		Order.add(orderItem);
		return Order;
	}
}
