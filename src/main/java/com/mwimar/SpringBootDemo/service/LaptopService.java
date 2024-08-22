package com.mwimar.SpringBootDemo.service;

import com.mwimar.SpringBootDemo.LaptopRepository;
import com.mwimar.SpringBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        System.out.println("Add Lap Method called...");
        repo.save(lap);

    };

    public boolean isGoodforProg(Laptop lap){
        return true;
    }
}
