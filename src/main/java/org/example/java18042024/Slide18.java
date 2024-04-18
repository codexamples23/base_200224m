package org.example.java18042024;

public class Slide18 {
    public static void main(String[] args) {
        System.out.println(getReturnSum(10, 15));

        Slide18 example = new Slide18();
        example.getSum(10, 5);
    }

    public void getSum(int a, int b) {
        System.out.println(a + b);
    }

    public static int getReturnSum(int a, int b) {
        return a + b;
    }

    public void f1(int x, String s) {

    }

    public void f1(String s, int x) {

    }

}
