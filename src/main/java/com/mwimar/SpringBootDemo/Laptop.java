package com.mwimar.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    Cpu cpu;
    public void compile(){
        cpu.process();
    }
}
