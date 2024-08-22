package com.mwimar.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    private Computer com;

    public void code(){
//        laptop.compile();
    };
}
