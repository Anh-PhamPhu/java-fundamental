package com.JavaCollections.List.ListVector;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(1);
        List<Person> vt = new Vector<Person>();

        vt.add(p);
        vt.remove(0);
        for(Person ps : vt){
            System.out.println(ps);
        }
    }
}
