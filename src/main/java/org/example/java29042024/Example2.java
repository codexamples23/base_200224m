package org.example.java29042024;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        String dayType;
        // переписать на if-else и на тернарный оператор
        // предполагаем, что день валидный -- от 1 до 7
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "рабочий";
                break;
            case 6:
            case 7:
                dayType = "не рабочий";
                break;
            default:
                dayType = "неправильный день";
        }
        System.out.println(dayType);


        if (day <= 5) {
            dayType = "рабочий";
        } else {
            dayType = "не рабочий";
        }
        System.out.println(dayType);

        dayType = day <= 5 ? "рабочий" : "не рабочий";

        System.out.println(dayType);
    }
}
