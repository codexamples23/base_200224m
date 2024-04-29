package org.example.java29042024;

public class Ternary {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int x;

        x = a > b ? b : a;
        // то же самое
        if (a > b) {
            x = b;
        } else {
            x = a;
        }
        // condition ? expression_when_true : expression_when_false
    }

    public int min(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }

    public int minTernary(int a, int b) {
        return a > b ? b : a;
    }
}
