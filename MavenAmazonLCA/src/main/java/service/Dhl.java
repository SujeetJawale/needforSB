package service;

public class Dhl implements DeliveryService {
	public Boolean deliveryProduct(Double amount) {
		System.out.println("Product Delivered Using Dhl");
		return true;
	}
}
