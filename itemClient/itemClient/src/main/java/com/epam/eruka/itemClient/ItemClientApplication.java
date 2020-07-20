package com.epam.eruka.itemClient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ItemClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemClientApplication.class, args);
	}

	@GetMapping("/receiveOrder")
	public Order getOrders() {
		Order order = new Order();
		OrderItem OrderItem = new OrderItem();
		OrderItem.setProductCode("re345");
		OrderItem.setProductName("Wipro");
		OrderItem.setQuantity("3");
		List<OrderItem> OrderItemList = new ArrayList<OrderItem>();
		order.setOrderItem(OrderItemList);
		return new Order();
	}
}
