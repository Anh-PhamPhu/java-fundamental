package com.JavaCollections.List.ComparatorJV8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> ps = new ArrayList<Person>();
        ps.add(new Person(1, "A"));
        ps.add(new Person(3, "B"));
        ps.add(new Person(5, "C"));
        ps.add(new Person(7, "D"));
        ps.add(new Person(6, "D"));

        System.out.println("Before sort");
        ps.forEach((p) -> {
            System.out.println(p.getId() + " : " +p.getName());
        });
        ps.sort((p1, p2) -> {
            if(p1.getName().compareTo(p2.getName()) > 0){
                return 1;
            }else if(p1.getName().compareTo(p2.getName()) > 0){
                return -1;
            }else{
                return p1.getId() - p2.getId();
            }
        });
        System.out.println("After sort");
        ps.forEach((p) -> {
            System.out.println(p.getId() + " : " +p.getName());
        });
    }
}
