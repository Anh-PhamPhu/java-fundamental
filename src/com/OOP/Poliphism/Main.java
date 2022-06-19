package com.OOP.Poliphism;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        Person emp2 = new Employee();

        emp.setName("ANH");
        emp.setLuong(100D);

        emp2.setName("ANH 2");
        //emp2.setLuong();
        Wolker w = new Wolker();
        Employee w2 = new Wolker();
        Person w3 = new Wolker();
        Object w4 = new Wolker();

        w.work();
        Wolker k1 = (Wolker) w2;
        k1.work();

        ((Wolker) w3).work();

        Person p = new Person();
        if(p instanceof Wolker){
            ((Wolker) p).work();
        }else {
            System.out.println("Not worker");
        }
    }
}
