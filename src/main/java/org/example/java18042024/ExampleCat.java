package org.example.java18042024;

public class ExampleCat {
    public static void main(String[] args) {
        // 2
        Cat cat = new Cat("Cat1");
        cat.sayName();
        // 3
        cat.setName("Cat2");
        // 4
        System.out.println(cat.getName());
    }
        /*
1. создать метод sayName, печатающий на экран имя кота
2. В методе main в другом классе создать экземпляр класса Cat, через sayName вывести его имя на экран
3. Переименовать кота через сеттер
4. Вывести его новое имя при помощи getName
     */
}
