package org.example.java24042024;

public class Compare {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a < b); // 10 < 20  true
        System.out.println(b > c); // 20 > 30  false
        System.out.println(a == c);// 10 == 30 false
        System.out.println(b <= a);// 20 <= 10 false
        System.out.println(c >= b);// 30 >= 20 true
        System.out.println(c != a);// 30 != 10 true
        System.out.println((a = b) + " , " + (c < a) + " , " + (b > c) + " , " + (c != a) + " , " + (a <= c));
    }
}

/*
Создайте три переменные
2. Сравните поочередно каждые из созданных переменных
используя реляционные операторы
3. Результат распечатайте в консоль

 */