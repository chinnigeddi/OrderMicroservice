package com.epam.eruka.itemClient;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Order {
	private String customerName;
	private String Shippingaddress;

	private List<OrderItem> orderItem;
	private String total;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getShippingaddress() {
		return Shippingaddress;
	}

	public void setShippingaddress(String shippingaddress) {
		Shippingaddress = shippingaddress;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
}
