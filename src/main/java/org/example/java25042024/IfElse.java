package org.example.java25042024;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if (a < 15) {
            System.out.println("a < 15");
        } else if (a > 15) {
            System.out.println("a > 15");
        } else {
            System.out.println("a == 15");
        }
        System.out.println(min(a, 15));
        System.out.println(returnNonNull(null));
        System.out.println(returnNonNull(new Object()));
    }

    public static Object returnNonNull(Object object) {
        if (object != null) {
            return object;
        }
        System.out.println("Object is null!");
        return new Object();
    }


    public static int min(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }

}
