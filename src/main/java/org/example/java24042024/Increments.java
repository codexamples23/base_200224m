package org.example.java24042024;

public class Increments {
    public static void main(String[] args) {
        int a = 2;
        int b = a-- + (++a * --a);
        System.out.println(b);
    }
}
