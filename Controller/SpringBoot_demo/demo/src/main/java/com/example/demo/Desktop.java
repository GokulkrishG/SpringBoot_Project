package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop implements Comp {
    public void compile(){
        System.out.println("Compling the Code faster");
    }
}
