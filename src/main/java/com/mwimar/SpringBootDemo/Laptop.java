package com.mwimar.SpringBootDemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    Cpu cpu;
    public void compile(){
        cpu.process();
    }
}
