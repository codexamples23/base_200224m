package org.example.java24042024;

import java.util.Scanner;

public class ScannerIncrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // получить следующее число с консоли
        int positiveCount = 0;
        int negativeCount = 0;
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        while (x != 0) {
            if (x > 0) {
                ++positiveCount; // префиксный можно, разницы тут нет
            } else {
                negativeCount++; // постфиксный можно, разницы тут нет
            }
            System.out.print("Enter a new number: ");
            x = scanner.nextInt();
        }
        System.out.println("Positives: " + positiveCount);
        System.out.println("Negatives: " + negativeCount);
    }
}

/*
Напишите программу, которая запрашивает у пользователя числа до тех пор,
 пока не будет введено число 0. Подсчитайте, сколько раз было введено каждое из чисел:
  положительное или отрицательное (используйте инкремент для счетчиков).
 */