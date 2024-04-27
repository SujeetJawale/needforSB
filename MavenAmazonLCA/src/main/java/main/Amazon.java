package main;

import service.DeliveryService;

public class Amazon {
	private DeliveryService service;

	public Amazon(DeliveryService service) {
		super();
		this.service = service;
	}

	public void setService(DeliveryService service) {
		this.service = service;
	}

	public Boolean deliveryTheProduct(Double amount) {
		return service.deliveryProduct(amount);
	}
}
