package org.programs.basics;

import java.util.HashMap;
import java.util.Map;

public class Person {

    public String age;

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return this.age;
    }

    public static void main(String[] a) {
        Child ch = new Child();
        ch.favoriteToy(Toy.CAR);
        ch.favoriteToy(Toy.SHIP);
        ch.favoriteToy(Toy.BUNNY);

        for (Toy toy : Toy.values()) {
            System.out.println("Toy : " + toy + ", Ordinal value :" + toy.ordinal());
        }
    }

}

class Child extends Person {
    void favoriteToy(Toy toy) {
        System.out.println("Toy selected is " + toy);
    }
}

enum Toy {
    CAR,
    SHIP,
    BUNNY
}

