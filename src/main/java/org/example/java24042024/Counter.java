package org.example.java24042024;

public class Counter {
    public static void main(String[] args) {
        int count;
        for (count = 1; count <= 10; count++) {
            System.out.println(count);
        }
        System.out.println("После цикла count: " + count);
        for (count = 10; count >= 1; count--) {
            System.out.println(count);
        }
    }
}

/*
Создайте класс Counter, в main методе которого будут выводиться числа от 1 до 10, затем обратно от 10 до 1.
Используйте переменную count.
Используйте инкремент для первой части и декремент для второй части.
 */