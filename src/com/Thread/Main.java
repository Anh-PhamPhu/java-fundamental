package com.Thread;

public class Main {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        Thread t1 = new Thread(mt1);

        MyThread2 mt2 = new MyThread2();

        t1.start();
        mt2.start();
    }
}
