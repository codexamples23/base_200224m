package org.example.java29042024;

public class Task1 {
    public static void main(String[] args) {
        int min = 100;
        int max = 999;
        int randomNum = (int)(Math.random() * (max - min + 1) + min);

        System.out.println(randomNum);
        int maxDigit = randomNum % 10;
        randomNum /= 10;
        // randomNum = randomNum / 10; то же самое

        maxDigit = randomNum % 10 > maxDigit ? randomNum % 10 : maxDigit;
        randomNum /= 10;
        maxDigit = randomNum % 10 > maxDigit ? randomNum % 10 : maxDigit;
        System.out.println(maxDigit);
    }
}

/*
Создать программу, выводящую на экран случайно сгенерированное
трёхзначное натуральное число и его наибольшую цифру.
Например: 398
Выход: 9

 */
