package org.example.java02052024;

import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0;
        for (;;) {
            String s = scanner.next();
            boolean toStop = false;
            switch (s) {
                case "up":
                    y++;
                    break;
                case "down":
                    y--;
                    break;
                case "right":
                    x++;
                    break;
                case "left":
                    x--;
                    break;
                case "loc":
                    System.out.println(x + " " + y);
                    break;
                case "stop":
                    System.out.println("Спасибо за участие");
                    toStop = true;
                    break;
                default:
                    System.out.println("wrong command");
            }
            if (toStop) {
                break;
            }
        }
        System.out.println(x + " " + y);
    }
}

/*
Напишите программу, которая принимает команды управления
персонажем в текстовой игре (up, down, right, left).
Используйте switch-case для обработки команд и
изменения положения персонажа на карте или вывода сообщений о действиях персонажа.
На команду loc должны выводиться текущие координаты.
после команды stop остановить считывание и вывести текущие координаты
Изначально начинаем в точке с координатами 0,0
 */
