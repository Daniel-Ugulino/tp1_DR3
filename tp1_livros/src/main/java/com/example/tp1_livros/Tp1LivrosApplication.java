package com.example.tp1_livros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Tp1LivrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp1LivrosApplication.class, args);
	}

}
