package com.JavaCollections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.add("A");
        queue.add("C");
        queue.add("B");

        queue.forEach((q) -> {
            System.out.println(q);
        });
    }
}
