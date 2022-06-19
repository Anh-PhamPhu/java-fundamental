package com.Serializble;

import java.io.*;

public class Person implements Serializable {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) throws IOException {
        Person p1 = new Person(1);

        File file = new File("test.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fileOS = new FileOutputStream(file);

        ObjectOutputStream objOS = new ObjectOutputStream(fileOS);

        objOS.writeObject(p1);
        objOS.close();
        fileOS.close();
    }
}
