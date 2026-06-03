package com.eduhub.eduhub_backend;


import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student()
    {
        System.out.println("Object Created");
    }
    public void study()
    {
        System.out.println("I am Studying");
    }
}
