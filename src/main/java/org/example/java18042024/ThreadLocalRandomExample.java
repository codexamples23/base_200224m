package org.example.java18042024;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomExample {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        // не нужно создавать экземпляр Random для каждого потока
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("Случайное число от " + min + " до " + max + ": " + randomNum);
    }
}

