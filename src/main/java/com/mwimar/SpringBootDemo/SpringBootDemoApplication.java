package com.mwimar.SpringBootDemo;

import com.mwimar.SpringBootDemo.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

Alien obj = context.getBean(Alien.class);
		System.out.println(obj.getAge());
obj.code();

//		Gpu obj1 = context.getBean(Gpu.class);
//		obj1.start();



	}

}
