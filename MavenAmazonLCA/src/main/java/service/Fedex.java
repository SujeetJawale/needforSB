package service;

public class Fedex implements DeliveryService {
	public Boolean deliveryProduct(Double amount) {
		System.out.println("Product Delivered Using Fedex");
		return true;
	}
}
