package com.mwimar.SpringBootDemo;

import com.mwimar.SpringBootDemo.model.Alien;
import com.mwimar.SpringBootDemo.model.Laptop;
import com.mwimar.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

//     Alien obj = context.getBean(Alien.class);
//	 	System.out.println(obj.getAge());
//         obj.code();
		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
//		Gpu obj1 = context.getBean(Gpu.class);
//		obj1.start();



	}

}
