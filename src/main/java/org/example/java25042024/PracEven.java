package org.example.java25042024;

import java.util.Scanner;

public class PracEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}

/*
написать программу, которая проверяет, является ли
введенное пользователем число четным или нечетным,
и выводит соответствующее сообщение.
 */