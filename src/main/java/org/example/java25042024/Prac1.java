package org.example.java25042024;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("Первое число больше");
        } else if (num2 > num1) {
            System.out.println("Второе число больше");
        } else {
            System.out.println("Числа равны");
        }
    }

    public boolean isAllowed(int height) {
        if (height > 140) {
            return true;
        }
        return false;
    }

    public boolean isAllowed2(int height) {
        return height > 140;
    }
}

/*
написать программу, которая считывает два целых
числа с клавиатуры и выводит на экран сообщение
о том, какое из чисел больше, или сообщает, что они равны.
"первое число больше"
"второе число больше"
"числа равны"
*/