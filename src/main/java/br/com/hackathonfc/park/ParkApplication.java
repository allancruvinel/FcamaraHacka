package br.com.hackathonfc.park;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
  
@SpringBootApplication
@EntityScan(basePackages = { "br.com.hackathonfc.park.entity" })
@EnableJpaRepositories(basePackages = { " br.com.hackathonfc.park.repository" })
@ComponentScan(basePackages = {"br.com.hackathonfc.park.controller"})
@SpringBootApplication
public class ParkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkApplication.class, args);
	}

}
