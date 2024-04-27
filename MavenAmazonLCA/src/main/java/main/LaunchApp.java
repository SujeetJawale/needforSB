package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		Amazon amz = container.getBean(Amazon.class);
		amz.deliveryTheProduct(4444.4);
	}

}
