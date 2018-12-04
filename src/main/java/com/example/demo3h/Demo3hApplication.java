package com.example.demo3h;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
@MapperScan("com.example.demo3h.mapper")
public class Demo3hApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo3hApplication.class, args);
	}
}
