package com.kritan.SpringBootP01;

import com.kritan.SpringBootP01.Beans.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootP01Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringBootP01Application.class, args); // IOC container yaha se activate hoga aur based on the jitne bhi beans honge use read karega aur DI karega
		Car bean=context.getBean(Car.class);
		bean.m1();
	}

}