package org.example.java22042024;

public class PrintNumbers {
    public static void main(String[] args) {
        printSpecialNumbers(20); // хотим видеть числа, делящиеся на 4
    }

    public static void printSpecialNumbers(int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}

