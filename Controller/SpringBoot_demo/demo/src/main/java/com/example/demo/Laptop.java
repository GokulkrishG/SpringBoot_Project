package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Laptop implements Comp {
    public void compile(){
        System.out.println("Compling the Code");
    }
}
