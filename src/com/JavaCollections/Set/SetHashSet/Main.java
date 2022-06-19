package com.JavaCollections.Set.SetHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<String>();

        setString.add("B");
        setString.add("A");
        setString.add("E");
        setString.add("C");
        setString.add("B");

        setString.forEach((s) -> {
            System.out.println(s);
        });

        Iterator<String> itr = setString.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
