package com.JavaCollections.Set.SetLinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Person> setP = new LinkedHashSet<Person>();

        setP.add(new Person(1));
        setP.add(new Person(2));
        setP.add(new Person(3));

        setP.remove(1);
    }
}
