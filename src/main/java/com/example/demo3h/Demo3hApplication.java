package com.example.demo3h;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo3h.mapper")
public class Demo3hApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo3hApplication.class, args);
	}
}
