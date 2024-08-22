package com.mwimar.SpringBootDemo;

import com.mwimar.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Component;

@Component
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in Database...");
    }
}
