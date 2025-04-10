package com.example.SpringBootDemoProject.model;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop  implements Computer{
    @Override
    public void code() {
        System.out.println("Coding using a laptop......");

    }
}
