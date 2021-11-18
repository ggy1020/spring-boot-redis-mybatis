package com.demo;

import com.demo.redis.TestRedis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = "com.demo")
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Demo1Application.class, args);
		TestRedis testRedis = context.getBean(TestRedis.class);
		testRedis.test();


	}


	@RequestMapping("/health")
	public String health(){
		return "health";
	}
}
