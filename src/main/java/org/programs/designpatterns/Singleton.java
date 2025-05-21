package org.programs.designpatterns;

public class Singleton {
    private static Singleton inst;

    private Singleton() {
    }

    //synchronized keyword added for thread safety
    public static synchronized Singleton getInstance() {
        if (inst == null) {
            inst = new Singleton();
        }
        return inst;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        if (singleton == singleton1) {
            System.out.println("same object returned, no instances created..");
        }
    }
}

