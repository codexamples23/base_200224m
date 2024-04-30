package org.example.java30042024;

import java.util.Scanner;

public class PrintSymbols {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '?':
                case '!':
                case '.':
                case ',':
                case ' ':
                case '\'':
                case '’':
                    break;
                default:
                    System.out.print(s.charAt(i) + ",");
            }
        }
    }
}

/*
Получите от пользователя Строку.
2. Напечатайте все буквы из строки, игнорируйте знаки препинания ?, !, ., ,’ и пробел
3. Для решения используйте цикл и charAt() метод
Например:
Вход = “I don’t like r'ain !”
выход = I,d,o,n,t,l,i,k,e,r,a,i,n
 */