package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev // first bean created
{

    @Autowired
    @Qualifier("desktop")
    private Comp comp;

//        public Dev(Laptop laptop) {
//            this.laptop = laptop;
//        }

//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build(){
        comp.compile();
        System.out.println("Building an Awesome Project");
    }
}
