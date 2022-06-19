package com.Fundamental.String;

public class Main {
    public static void main(String[] args) {
        String name = "Anh.PhamPhu";

        //ASynchronized faster String Buffer
        StringBuilder s = new StringBuilder();

        s.append("Hello");
        s.append("Anh Pham Phu");

        String s2 = s.toString();

        //Synchronized
    }
}
