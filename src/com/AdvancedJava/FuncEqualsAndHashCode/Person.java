package com.AdvancedJava.FuncEqualsAndHashCode;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
