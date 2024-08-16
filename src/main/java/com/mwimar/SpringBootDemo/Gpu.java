package com.mwimar.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gpu {

    @Autowired
    Cpu cpu;

    public void start(){
        cpu.process();

    }
}
