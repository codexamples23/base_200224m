package org.example.java22042024;

public class AnotherRandomStudent {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(getRandomStudent(5));
        }
    }

    public static int getRandomStudent(int studentCount) {
        int min = 2;
        int max = studentCount;
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
