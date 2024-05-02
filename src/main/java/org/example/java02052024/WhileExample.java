package org.example.java02052024;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num = scanner.nextInt();

        while (num != 0) {
            sum += num;
            num = scanner.nextInt();
        }

        System.out.println(sum);
    }

    // Определите сумму всех элементов последовательности, завершающейся числом 0
    // 4 2 1 10 15 0
}
