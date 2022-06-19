package com.JavaCollections.List.SortList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();

        listString.add("ANH");
        listString.add("ANH1");
        listString.add("ANH2");
        listString.add("ANH3");

        for(String s : listString){
            System.out.println(s);
        }

        System.out.println("Sorted!!!");

        Collections.sort(listString);
        for(String s : listString){
            System.out.println(s);
        }

        List<Person> listPs = new ArrayList<Person>();

        listPs.add(new Person(1, "A"));
        listPs.add(new Person(3, "A"));
        listPs.add(new Person(4, "A"));
        listPs.add(new Person(2, "A"));

        System.out.println("Non sort");
        for(Person ps : listPs){
            System.out.println(ps.getId());
        }
        System.out.println("Sorted");
        Collections.sort(listPs);
        for(Person ps : listPs){
            System.out.println(ps.getId());
        }
    }
}
