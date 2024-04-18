package org.example.java18042024;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int x = 5, y = 10;
        System.out.println(min(x, y));

        Dog dog = new Dog("Sharik");
        dog.say();
        System.out.println("Get say: " + dog.getSay());

        dog.setName("Bobik");


        Main main = new Main();
        main.getName();
    }
    // сигнатура это имя метода + параметры
    // min(int a, int b, int c)
    // контракт метода это сигнатура + тип возвр значения + исключения
    // int min(int a, int b, int c) throws IOException

    public String getName() {
        return "Name";
    }

    private void printName(String name) {
        System.out.println(name);
    }

    public static int min(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }

    public static int min() throws IOException {
        // считываем 3 числа с файла
        return 1;
    }
}