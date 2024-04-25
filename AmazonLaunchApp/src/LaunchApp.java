import services.BlueDart;
import services.Dhl;
import services.Fedex;

public class LaunchApp {
	public static void main(String[] args) {
		System.out.println("Welcome to our First Loosly Coupled Application");
		Amazon a1 = new Amazon(new Fedex());
		Amazon a2 = new Amazon(new Dhl());
		Amazon a3 = new Amazon(new BlueDart());

		boolean status = a3.deliveryTheProduct(1221.2);

		if (status)
			System.out.println("Product Delivered Successfully");
		else
			System.out.println("Failed");
	}
}
