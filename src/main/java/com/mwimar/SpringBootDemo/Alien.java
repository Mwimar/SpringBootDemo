package com.mwimar.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    private int age;


    private Computer com;

    public void code(){
        com.compile();
    };
}
