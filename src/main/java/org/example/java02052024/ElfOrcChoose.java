package org.example.java02052024;

import java.util.Scanner;

public class ElfOrcChoose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Elf\n2. Orc\n3. Exit");
        int choice = scanner.nextInt();
        while (choice != 1 && choice != 2 && choice != 3) {
            System.out.println("Choose any one:");
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                System.out.println("Elf");
                break;
            case 2:
                System.out.println("Orc");
                break;
            case 3:
                System.out.println("Exit");
                break;
        }
    }
}

// Реализуйте меню выбора игрока (Elf or Orc and Exit)
//a. Отобразите меню
//i. 1. Elf
//ii. 2. Orc
//iii. 3. Exit
//b. Проверьте ввод на соответствие, в случае неверного ввода
//распечатайте "Choose any one : " и покажите меню выбора
//c. Сохраните выбор
//d. Распечатайте выбор в консоль