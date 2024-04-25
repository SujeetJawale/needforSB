package services;

public class Fedex implements DeliveryService{

	@Override
	public Boolean deliveryProduct(Double amount) {
		System.out.println("Product Delivered Using Fedex");
		return true;
	}
}
