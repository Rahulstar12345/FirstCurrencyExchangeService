package com.BikkadIT.ClientApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.BikkadIT.Additionogic.calculator.sum;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);

		sum s = new sum();
		int sum = s.sum(22, 28);
		System.out.println(sum);
	}

}
