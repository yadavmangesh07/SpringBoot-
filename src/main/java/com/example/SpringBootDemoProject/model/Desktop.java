package com.example.SpringBootDemoProject.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements  Computer{
    @Override
    public void code() {
        System.out.println("Coding using a desktop.....");
    }
}
