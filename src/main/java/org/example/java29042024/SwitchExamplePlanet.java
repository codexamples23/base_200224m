package org.example.java29042024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchExamplePlanet {
    public static void main(String[] args) {
        int numberFromSun = new Scanner(System.in).nextInt();
        System.out.println(getAtmosphere(numberFromSun));
    }

    public static List<String> getAtmosphere(int numberFromSun) {
        List<String> result = new ArrayList<>();
        switch (numberFromSun) {
            case 1:
                result.add("No atmosphere");
                break;
            case 2:
            case 4:
                result.add("CO2");
                break;
            case 3:
                result.add("CO2");
                result.add("N2");
                result.add("O2");
                break;
            case 5:
            case 6:
                result.add("H2");
                result.add("He");
                break;
            case 7:
            case 8:
                result.add("CH4");
                result.add("H2");
                result.add("He");
                break;
            default:
                break;
        }
        return result;
    }
}
