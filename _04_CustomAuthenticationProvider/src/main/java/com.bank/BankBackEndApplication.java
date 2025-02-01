package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication

//@EnableWebSecurity -- Optional in spring boot
/*@EntityScan("com.bank.model")
@EnableJpaRepositories("com.bank.repository")*/
public class BankBackEndApplication {
	public static void main(String[] args) {
		SpringApplication.run(BankBackEndApplication.class, args);
	}

}
