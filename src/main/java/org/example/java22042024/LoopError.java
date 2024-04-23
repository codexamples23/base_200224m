package org.example.java22042024;

public class LoopError {
    public static void main(String[] args) {
        String str = "Hello";
        while (str == "Hello") {
            str = new String("Hello");
            System.out.println(str);
        }
    }
}
