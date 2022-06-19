package com.Thread;

public class TestThread extends Thread{

    private String threadName;

    public TestThread(String name){
        this.threadName = name;
    }
    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread("A");
        TestThread t2 = new TestThread("B");

        t1.start();
        t2.start();
    }
}
