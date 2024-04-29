package org.example.java29042024;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        boolean condition1 = true, condition2 = false;
        int num = new Scanner(System.in).nextInt();


        if (condition1) {
            System.out.println();
        }

        if (condition1) {
            System.out.println();
        } else {
            System.out.println();
        }

        if (condition1) {
            if (condition2) {

            }
        } else {
            if (condition2) {

            }
        }

        if (num == 5) {
            System.out.println("5");
        } else if (num == 10) {
            System.out.println("10");
        } else if (num == 15) {
            System.out.println("15");
        } else {
            System.out.println("wrong number");
        }

        String s = "dog";
        switch (num) {
            case 5:
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
                break;
            case 15:
                System.out.println("15");
                switch (s) {
                    case "cat":
                        System.out.println("cat");
                        break;
                    case "dog":
                        System.out.println("dog");
                        break;
                    default:
                        System.out.println("not a pet");
                }
                break;
            default:
                System.out.println("wrong number");
                break;
        }

        if (condition1) {
            return;
        } // всё что дальше автоматически else ветка
        return;

    }
}
