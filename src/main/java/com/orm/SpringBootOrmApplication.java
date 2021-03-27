package com.orm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.orm.config.PersistenceConfig;

@SpringBootApplication
@Import(value = {PersistenceConfig.class})

public class SpringBootOrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOrmApplication.class, args);
	}

}
