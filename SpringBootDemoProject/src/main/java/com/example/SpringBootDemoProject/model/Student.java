package com.example.SpringBootDemoProject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("Mangesh") // to provide a default value 
    String name;
    int age;
    @Autowired
    @Qualifier("desktop") //has higher priority than @Primary Annotation
    Computer computer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }


    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void study(){
        System.out.print(name+" is ");
        getComputer().code();



    }


}
