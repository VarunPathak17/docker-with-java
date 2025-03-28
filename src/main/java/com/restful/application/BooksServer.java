package com.restful.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//(exclude = {DataSourceAutoConfiguration.class }) // add this To not pickup the sql
public class BooksServer {

	public static void main(String... args) {
		SpringApplication.run(BooksServer.class, args);
	}

}
