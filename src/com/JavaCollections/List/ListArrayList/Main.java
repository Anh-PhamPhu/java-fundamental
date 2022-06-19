package com.JavaCollections.List.ListArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(2);
        Person p3 = new Person(3);

        // List
        List<Person> listPerson = new ArrayList<Person>();

        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p1);
        listPerson.add(p2);

        Person p = listPerson.get(0);
        System.out.println(p.getId());

        for( Person ps: listPerson){
            System.out.println(ps.getId());
        }

        // remove
        listPerson.remove(3);
        for( Person ps: listPerson){
            System.out.println(ps.getId());
        }

        listPerson.remove(p1);
        for( Person ps: listPerson){
            System.out.println(ps.getId());
        }
    }
}
