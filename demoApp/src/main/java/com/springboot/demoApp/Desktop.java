package com.springboot.demoApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Compiling with Springboot project but faster");
    }
}
