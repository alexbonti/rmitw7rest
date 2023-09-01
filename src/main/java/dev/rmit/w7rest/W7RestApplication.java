package dev.rmit.w7rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import dev.rmit.w7rest.model.Product;
import dev.rmit.w7rest.repository.ProductRepository;



@SpringBootApplication
public class W7RestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(W7RestApplication.class, args);
		Object dataSource = context.getBean("dataSource");
		System.out.println(dataSource);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository repository) {
		return args -> {
			repository.save(new Product(null,"Shoes",328));
			repository.save(new Product(null,"Oil",130));

		};
	}

}
