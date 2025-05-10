package org.programs.inheritance;

public class InheritanceDemo {
    public static void main(String[] a){
     /*   Vehicle v = new Vehicle();
        v.start();
        Car c = new Car();
        c.start();
        c.drive();
     */   SportsCar sc = new SportsCar();
        sc.start();
        sc.drive();
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class SportsCar extends Car {
    @Override
    void drive() {
//        super.drive();
        System.out.println("Sports car driving fast");
    }
}
