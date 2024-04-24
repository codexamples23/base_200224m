package org.example.java24042024;

public class Expressions {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 10, d = 10;
        if (a < b && b == c) {
            System.out.println("выражение истино: ");
        } else {
            System.out.println("выражение ложно: ");
        }
        System.out.println("“а” меньше “b” И “b” равно “c”");

        if (a > b || c == d) {
            System.out.println("выражение истино: ");
        } else {
            System.out.println("выражение ложно: ");
        }
        System.out.println("“а” больше “b” ИЛИ “c” равно “d”");

        if (a != b) {
            System.out.println("выражение истино: ");
        } else {
            System.out.println("выражение ложно: ");
        }
        System.out.println("“а” НЕ равно “b”");
    }
}

/*
1. Создайте переменные int a, b, c, d;
2. Используя блок if (выражение) {}, составьте логические выражения
    a. составить выражение, которое истина если: “а” меньше “b” И “b” равно “c” (и ложно в противном случае)
    b. истина , если “а” больше “b” ИЛИ “c” равно “d”;
    c. истина , если “а” НЕ равно “b”;
 */
