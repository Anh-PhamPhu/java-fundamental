package com.OOP.Contructor;

public class Machine {
    String name;
    double price;

    public Machine(){
        this.name = "Coffee Machine!";
        this.price = 100000;
    }

    public Machine(String name, double price){
        this.name = name;
        this.price = price;
    }
}
