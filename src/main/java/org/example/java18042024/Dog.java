package org.example.java18042024;

public class Dog {

    private static final String SAY = "Woof";

    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        System.out.println("У собаки новая кличка: " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void say() {
        System.out.println(SAY);
    }

    public String getSay() {
        return SAY;
    }
}
