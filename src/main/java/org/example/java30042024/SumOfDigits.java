package org.example.java30042024;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            // digit = Character.getNumericValue(digit);
            sum += digit;
        }
        System.out.println(sum);

        int number = new Scanner(System.in).nextInt();
        sum = 0;
        for (int digit = number % 10; number > 0; number /= 10, digit = number % 10) {
            sum += digit;
        }
        System.out.println(sum);
    }
}
