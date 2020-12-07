package com.example.bellerophon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.bellerophon.controller.hello.*;

@SpringBootApplication //раб с bean-компонентами
public class BellerophonApplication {

	public static void main(String[] args) {
		SpringApplication.run(BellerophonApplication.class, args);

		GreetingWebClient gwc = new GreetingWebClient(); //реактивный Restful
		System.out.println(gwc.getResult());
	}
}
