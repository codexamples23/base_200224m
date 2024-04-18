package org.example.java18042024;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        int upperBound = 16;
        int lowerBound = 5;
        System.out.println(random.nextInt(lowerBound, upperBound));

        double randomDouble = random.nextDouble(); // от 0.0 включительно до 1.0 НЕ включительно
        System.out.println(randomDouble);

        for (int i = 1; i < 11; i++) {
            System.out.println("Dice " + i + ": " + dice());
        }
    }

    public static int dice() {
        Random random = new Random();
        return random.nextInt(1, 7);
    }

    // формула для диапозона от min до max:
    // Math.random()*(max-min+1)+min
}
