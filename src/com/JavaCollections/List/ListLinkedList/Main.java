package com.JavaCollections.List.ListLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(1);

        List<Person> list = new LinkedList<Person>();
        list.add(p);

        for(Person p2 : list){
            System.out.println(p2.getId());
        }
    }
}
