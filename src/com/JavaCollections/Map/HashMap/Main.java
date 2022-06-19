package com.JavaCollections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "A");
        map.put(2, "B");

        Set<Integer> keySet = map.keySet();

        keySet.forEach((k) -> {
            System.out.println(k + " : " + map.get(k));
        });

        for(Map.Entry<Integer, String> s : map.entrySet()){
            s.getKey();
            s.getValue();
        }

        Map<String, Person> mapPs = new HashMap<String, Person>();

        mapPs.put("A", new Person(1));
        mapPs.put("A2", new Person(2));

        Person p = mapPs.get("A");
    }
}
