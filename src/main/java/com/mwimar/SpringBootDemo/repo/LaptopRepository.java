package com.mwimar.SpringBootDemo.repo;

import com.mwimar.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in Database...");
    }
}
