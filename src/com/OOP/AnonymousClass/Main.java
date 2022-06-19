package com.OOP.AnonymousClass;

public class Main {
    public static void main(String[] args) {
        PersonService ps = new PersonService() {
            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };
    }
}
