package com.JavaCollections.List.IteratorInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");

        // Can not remove in Loop
        /*
        list.forEach((s) -> {
            if(s.equals("A")){
                list.remove(s);
            }
        });
        */
        Iterator<String> itr = list.iterator();

        while(itr.hasNext()){
            String s = itr.next();
            if(s.equals("A")){
                itr.remove();
            }
            //System.out.println(s);
        }
        list.forEach((s) -> {
            System.out.println(s);
        });

    }
}
