package org.programs.basics;

public class GarbageCollectionEx {
    public static void main(String[] args) {
        // Create objects
        MyClass obj1 = new MyClass(1);
        MyClass obj2 = new MyClass(2);
        MyClass obj3 = new MyClass(3);

        // Set obj1 and obj2 to null, making them eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Suggest garbage collection to the JVM (not guaranteed to run immediately)
        System.gc();

        // Create another object
        MyClass obj4 = new MyClass(4);
    }
}

class MyClass {
    private int id;

    public MyClass(int id) {
        this.id = id;
        System.out.println("Object with ID " + id + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object with ID " + id + " garbage collected.");
    }
}
