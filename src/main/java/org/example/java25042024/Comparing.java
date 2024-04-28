package org.example.java25042024;

public class Comparing {
    public static void main(String[] args) {
        Dog bobik = new Dog(5);
        Dog sharik = new Dog(4);
        System.out.println(compareDogs(bobik, sharik));
        System.out.println(compareDogs(sharik, bobik));
        System.out.println(compareDogs(bobik, bobik));
        System.out.println(compareDogs(sharik, null));
    }

    public static int compareDogs(Dog dog1, Dog dog2) {
        // вернуть -1 если первая собака младше
        // 1 если первая собака старше
        // 0 если собаки равны
        // -2 если одна из собак null
        if (dog1 == null || dog2 == null) {
            return -2;
        }
        if (dog1.getAge() > dog2.getAge()) {
            return 1;
        }
        if (dog1.getAge() < dog2.getAge()) {
            return -1;
        }
        return 0;
    }

    public static Dog getYoungestDog(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1 == null || dog2 == null || dog3 == null) {
            return new Dog(-1);
        }
        if (dog1.getAge() <= dog2.getAge() && dog1.getAge() <= dog3.getAge()) {
            return dog1;
        }
        if (dog2.getAge() <= dog1.getAge() && dog2.getAge() <= dog3.getAge()) {
            return dog2;
        }
        return dog3;
    }
}
