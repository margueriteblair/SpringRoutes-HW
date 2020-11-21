package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringHomeworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringHomeworkApplication.class, args);
		//configures the container
		//with scope=prototype, the object is actually made twice
		//not just being called upon twice in a spring container
		Alien a = context.getBean(Alien.class);
		a.show();
		Alien a1 = context.getBean(Alien.class);
		a.show();
	}

}
