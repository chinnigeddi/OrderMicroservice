package com.epam.eruka.itemClient;

import org.springframework.stereotype.Component;

@Component
public class OrderItem {
private String productCode;
private String productName;
private String quantity;
public String getProductCode() {
	return productCode;
}
public void setProductCode(String productCode) {
	this.productCode = productCode;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}

}
