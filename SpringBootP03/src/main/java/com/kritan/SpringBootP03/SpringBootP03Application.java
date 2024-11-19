package com.kritan.SpringBootP03;

import com.kritan.SpringBootP03.Beans.FlipkartPayment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootP03Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootP03Application.class, args);
		FlipkartPayment bean=context.getBean(FlipkartPayment.class);  // way to get the object of any class, but here we are taking object of FipkartPayment class
		bean.pay();
	}

}
