package service;

public class BlueDart implements DeliveryService {
	public Boolean deliveryProduct(Double amount) {
		System.out.println("Product Delivered Using Bluedart");
		return true;
	}

}
