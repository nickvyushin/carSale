package com.example.carSale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CarSaleApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CarSaleApplication.class, args);

//		Car carForFamily = new Car(configuration);
//		System.out.println(carForFamily.readyForSale());
//		Car carForStudent = new Car(configuration);
//		System.out.println(carForStudent.readyForSale());

//		Car carForFamily = new Car(new ClassicConfiguration());
//		System.out.println(carForFamily.readyForSale());
//		Car carForStudent = new Car(new SportConfiguration());
//		System.out.println(carForStudent.readyForSale());

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Car newCarForFamily = context.getBean("classicCar", Car.class);
		Car newCarForStudent = context.getBean("sportCar", Car.class);
		Car newCarForBoss = context.getBean("luxCar", Car.class);
		Car newCarForBusinessman = context.getBean("premiumCar", Car.class);

		System.out.println(newCarForFamily.readyForSale());
		System.out.println(newCarForStudent.readyForSale());
		System.out.println(newCarForBoss.readyForSale());
		System.out.println(newCarForBusinessman.readyForSale());
	}

}
