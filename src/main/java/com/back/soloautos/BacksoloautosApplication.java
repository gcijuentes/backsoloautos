package com.back.soloautos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.back.soloautos")
@EnableJpaRepositories("com.back.soloautos.repository")
@ComponentScan(value = {"com.back.soloautos"})
public class BacksoloautosApplication {

	public static void main(String[] args) {
		SpringApplication.run(BacksoloautosApplication.class, args);
	}


}
