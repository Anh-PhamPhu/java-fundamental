package com.OOP.Enumeration;

public enum MyEnum {
    CAFE("cafe"),
    TEA("green tea");
    private String name;

    private MyEnum(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
