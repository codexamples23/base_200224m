package org.example.java25042024;

public class Prac4 {
    public static void main(String[] args) {
        System.out.println(minOfThree(1, 1, 2));
    }

    // вернуть минимальное из трех чисел
    public static int minOfThree(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        }
        if (b <= a && b <= c) {
            return b;
        }
        return c;
    }

    public static int minOfThree2(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b < c) {
                return b;
            } else {
                return c;
            }
        }
    }
}

