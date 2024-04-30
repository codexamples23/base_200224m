package org.example.java30042024;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println(sumOfEntries(scanner.nextInt(), scanner.nextInt()));
        }

    }

    public static int sumOfEntries(int a, int b) {
        int sum = 0;
        for (int i = 1; i <= (a > b ? a : b); i++) {
            sum += i;
        }
        return sum;
    }
}
