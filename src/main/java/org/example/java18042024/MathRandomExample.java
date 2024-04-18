package org.example.java18042024;

public class MathRandomExample {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int randomNum = (int)(Math.random() * (max - min + 1) + min); // число [0.0; 1.0)
        System.out.println("Случайное число от " + min + " до " + max + ": " + randomNum);

        printWeatherForecast();
        System.out.println(generateTemperature(5, 45));
    }

    public static void printWeatherForecast() {
        System.out.println("Сегодня: " + generateTemperature());
        System.out.println("Завтра: " + generateTemperature());
        System.out.println("Послезавтра: " + generateTemperature());
    }

    public static int getTodayWeather() {
        return generateTemperature();
    }

    public static int generateTemperature() {
        int minTemp = -21, maxTemp = 31;
        return (int) (Math.random() * (maxTemp - minTemp + 1) + minTemp);
    }

    // написать перегруженный метод generateTemperature(int minTemp, int maxTemp)
    // overloading
    // в перегрузке нет ничего плохого. просто такой термин.
    public static int generateTemperature(int minTemp, int maxTemp) {
        return (int) (Math.random() * (maxTemp - minTemp + 1) + minTemp);
    }
}
