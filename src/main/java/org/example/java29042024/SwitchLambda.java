package org.example.java29042024;

public class SwitchLambda {
    public static void main(String[] args) {
        // java 13+
        int dayOfTheWeek = 3;
        String value = switch (dayOfTheWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> {
                System.out.println("It is wednesday");
                yield "Wednesday";
            }
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> {
                System.out.println("Sunday");
                yield "Sunday";
            }
            default -> {
                throw new RuntimeException("Wrong day");
            }
        };
        System.out.println(value);
    }
}
