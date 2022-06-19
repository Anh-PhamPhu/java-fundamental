package com.OOP.Packaged;

public class Person {
    private String firstName;
    private String lastName;
    private String fullName;

    public void setFullName(String firstName, String lastName){
        this.fullName = firstName + lastName;
    }

    public String getFullName(){
        return this.fullName;
    }
}
