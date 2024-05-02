package org.example.java02052024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean exists = false;
        for (int a = 0; a <= n / 3; a++) {
            if ((n - 3 * a) % 5 == 0) {
                System.out.println(a + " " + (n - 3*a) / 5);
                exists = true;
                break;
            }
        }

        if (!exists) {
            System.out.println("-1 - 1");
        }
    }
}

// Многие натуральные числа можно представить в виде n = 3*A + 5*B, где A и B -- целые неотрицательные числа.
//Вам требуется по заданному числу определить, можно ли его представить в таком виде, и если это возможно, найти подходящие A и B.
//В противном случае вывести -1 -1
