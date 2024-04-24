package org.example.java24042024;

import java.util.Random;

public class ArrayOfRandoms {
    public static void main(String[] args) {
        int arr[] = new int[20];

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arr[i] = random.nextInt(100);
        }

        int even = 0, odd = 0;
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}

/*
  Создайте массив из 20 случайных целых чисел.
  Используя цикл, подсчитайте количество чётных и нечётных чисел в массиве,
  используя инкремент для обоих счетчиков. Выведите оба счетчика после окончания цикла.
 */