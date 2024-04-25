package services;

public class BlueDart implements DeliveryService {

	@Override
	public Boolean deliveryProduct(Double amount) {
		System.out.println("Product Delivered Using Bluedart");
		return true;
	}

}
