package org.programs.designpatterns;

// Prototype interface
interface Shape2 extends Cloneable {
    Shape2 clone();
    void draw();
}

// Concrete prototype class
class Circle2 implements Shape2 {
    private int radius;

    public Circle2(int radius) {
        this.radius = radius;
    }

    public Circle2(Circle2 source) {
        this.radius = source.radius;
    }

    @Override
    public Shape2 clone() {
        return new Circle2(this);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

// Client class
class PrototypeMain {
    public static void main(String[] args) {
        Circle2 circlePrototype = new Circle2(10);
        Shape2 clonedCircle = circlePrototype.clone();

        circlePrototype.draw();
        clonedCircle.draw();
    }
}
