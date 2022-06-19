package com.OOP.NonStaticInnerClass;

public class Main {
    //inner class
    public class Dog {

    }

    // can not extends outer class
    public class DogSub extends Dog{
        public void run(){
            class PullDog {
//                private name;
                public void play(){
                    System.out.println("Hello");
                }
            }
            PullDog pull = new PullDog();
            pull.play();
        }

    }

    public static void main(String[] args) {
        Main m = new Main();

        Main.Dog d = m.new Dog();

    }
}
