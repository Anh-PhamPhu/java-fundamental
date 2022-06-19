package com.OOP.ExceptionInJava;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2};

        try {
            System.out.println(arr[3]);
        }catch(Exception e) {
            System.out.println("Error : " + e);
        }finally {
            System.out.println("Finally!!!");
        }

        System.out.println("End!!!");

    }
}
