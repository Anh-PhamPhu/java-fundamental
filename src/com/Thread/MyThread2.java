package com.Thread;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Thread 2 : " + i);
        }
    }
}
