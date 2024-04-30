package org.example.java30042024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // считывать число с экрана и умножать на 2
        // На 0 прекращать выполнение
        Scanner scanner = new Scanner(System.in);
        for (int num = scanner.nextInt(); num != 0; num = scanner.nextInt()) {
            System.out.println(num * 2);
        }

        for (;;) {
            // infinite loop
        }
    }

}
