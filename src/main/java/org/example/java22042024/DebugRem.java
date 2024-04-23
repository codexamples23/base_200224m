package org.example.java22042024;

import java.util.Scanner;

public class DebugRem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int ans = 0;
        if (v < 0) {
            ans = (v * t) % 54;
            System.out.println(54 + ans);
        } else if (v == 0) {
            System.out.println(0);
        } else {
            System.out.println(v * t % 54);
        }
    }
}
