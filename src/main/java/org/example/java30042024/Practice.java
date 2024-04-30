package org.example.java30042024;

public class Practice {
    public static void main(String[] args) {
        System.out.println('0');
        printHello();
        printEvens(8);
        printEvens2(8);
        printEvensBackwards(8);
    }

    public static void printHello() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello my friend !");
        }
    }

    //Создайте метод, который принимает число и выводит в консоль все четные положительные числа меньше него
    // сделать проверку на четность
    // сделать итерацию с 2йки по +2
    public static void printEvens(int num) {
        for (int i = 2; i < num; i += 2) {
            System.out.println(i);
        }
    }

    public static void printEvens2(int num) {
        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printEvensBackwards(int num) {
        for (int i = num - 1; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

// Создайте метод, при вызове которого печатается 5 раз “Hello my friend !”
