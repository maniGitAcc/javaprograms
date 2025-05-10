package org.programs.generics;

class GenericBox<T> {
    private T content;
    GenericBox(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }
    public void setContent(T content) {
        this.content = content;
    }
}

public class GenericEx {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(10);
        System.out.println("Integer Box Content: " + integerBox.getContent());

        GenericBox<String> stringBox = new GenericBox<>("Hello");
        System.out.println("String Box Content: " + stringBox.getContent());

        GenericBox<Double> doubleBox = new GenericBox<>(34.45);
        System.out.println("Double Box Content: " + doubleBox.getContent());
    }
}
