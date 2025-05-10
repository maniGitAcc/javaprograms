package org.programs.designpatterns;

public class Singleton {
    private static Singleton inst;

    private Singleton() {
    }
    public static Singleton getInstance() {
        if (inst == null) {
            inst = new Singleton();
        }
        return inst;
    }

    public static void main(String[] ar){
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        if(singleton == singleton1){
            System.out.println("same object returned, no instances created..");
        }
    }
}

