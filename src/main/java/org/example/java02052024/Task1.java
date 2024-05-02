package org.example.java02052024;

public class Task1 {
    public static void main(String[] args) {
        int count = 10;
        printHelloWhile(count);
        System.out.println();
        printHelloFor(count);
    }

    public static void printHelloFor(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Привет программист");
        }

//        for (; count > 0; count--) {
//            System.out.println("Привет программист");
//        }
    }

    public static void printHelloWhile(int count) {
        while (count > 0) {
            System.out.println("Привет программист");
            count--;
        }

//        int i = 0;
//        while (i < count) {
//            System.out.println("Привет программист");
//            i++;
//        }
    }
}

/*
1. Инициализируйте переменную int count = 10;
2. Создать метод, который печатает в консоле “Привет программист”
count раз
3. Используйте цикл while
 */
