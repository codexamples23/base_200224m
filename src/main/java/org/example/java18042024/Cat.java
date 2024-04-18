package org.example.java18042024;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.println(name);
    }

    /*
1. создать метод sayName, печатающий на экран имя кота
2. В методе main в другом классе создать экземпляр класса Cat, через sayName вывести его имя на экран
3. Переименовать кота через сеттер
4. Вывести его новое имя при помощи getName
     */
}
