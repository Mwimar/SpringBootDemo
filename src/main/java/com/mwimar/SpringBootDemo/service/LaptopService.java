package com.mwimar.SpringBootDemo.service;

import com.mwimar.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap){
        System.out.println("Add Lap Method called...");

    };

    public boolean isGoodforProg(Laptop lap){
        return true;
    }
}
