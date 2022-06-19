package com.Fundamental.Loops;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int[] arr = {1, 2, 3, 4, 5};
        // While Loop
        while(i < 5){
            System.out.println(i);
            i++;
        }

        // Do while
        do{
            System.out.println(i);
            i++;
        }while(i < 5);

        // For loop
        for(i = 0; i < 5; i++){
            System.out.println(i);
        }

        // ForEach
        for(int x: arr){
            System.out.println(x);
        }

    }
}
