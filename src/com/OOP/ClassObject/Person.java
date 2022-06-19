package com.OOP.ClassObject;

public class Person {
    String name = "Anh";
    int age = 26;

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

    public void run(){
        System.out.println("Running!!!");
    }
}
