package org.programs.designpatterns;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
class Client {
    public static void main(String[] args) {
        EagerSingleton singleton = EagerSingleton.getInstance();
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        if(singleton == singleton1){
            System.out.println("same object returned, no instances created..");
        }
    }
}

