package services;

public class Dhl implements DeliveryService {

	@Override
	public Boolean deliveryProduct(Double amount) {
		System.out.println("Product Delivered Using DHL");
		return true;
	}

}
