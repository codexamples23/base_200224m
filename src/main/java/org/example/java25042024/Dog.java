package org.example.java25042024;

public class Dog {
    private int age;
    private String name;

    public Dog(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean hasName() {
        // возвращает false если у собаки нет имени (оно Null) и true, если имя есть
        if (name == null) {
            return false;
        }
        return true;
    }

    public boolean hasName2() {
        // возвращает false если у собаки нет имени (оно Null) и true, если имя есть
        return name != null;
    }

}
