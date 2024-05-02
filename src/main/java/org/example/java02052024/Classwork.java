package org.example.java02052024;

import java.util.Scanner;

public class Classwork {

    public static void main(String[] args) {

        int x = 20;
        int sum = 0;

        do {
            sum += x;
            x--;
        } while (x > 10);
        System.out.println("Sum: " + sum);

//        weirdSumPrinter();
//        doWhileExample();
    }


    public static void doWhileExample() {
        int i = 0;
        do {
            System.out.println("Я в теле do");
            i++;
        } while (i < 0);
    }
    /*
    ЗАДАНИЕ
1. Используйте цикл do-while
2. Инициализируйте переменную int i = 0;
3. Добавьте в тело инструкцию System.out.println("Я в теле DO");
4. Определите условие i < 3
5. Запустите код
6. Определите условие i < 0
7. Проанализируйте результат
     */

    public static void weirdSumPrinter() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();

        while (a != b) {
            System.out.println(a + b);
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        System.out.println(a);
    }
}



/*
написать программу, считывающую 2 числа и выводящую их сумму
если два числа равны между собой, вывести одно число и остановить программу.
 */












/*
Напишите программу, которая будет печатать коробку из #, принимая от пользователя
значения высоты и ширины.
Например:
Вход = 3, 3
Выход =
###
###
###
 */
