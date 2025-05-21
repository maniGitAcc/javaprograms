package org.programs.designpatterns;

//Enum singletons are thread safe
public enum SingletonEnum {
    INSTANCE;  // The single instance of the enum

    // Add any fields and methods you need for your singleton
    private final String message;

    SingletonEnum() {
        this.message = "Hello, Singleton!";
    }

    public String getMessage() {
        return message;
    }
}

class Main {
    public static void main(String[] args) {
        SingletonEnum singleton1 = SingletonEnum.INSTANCE;
        System.out.println(singleton1.getMessage());
        SingletonEnum singleton2 = SingletonEnum.INSTANCE;
        System.out.println(singleton2.getMessage());
        if (singleton1 == singleton2) {
            System.out.println("same object returned, no instances created..");
        }
    }
}
