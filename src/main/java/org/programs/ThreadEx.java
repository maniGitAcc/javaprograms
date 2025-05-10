package org.programs;

public class ThreadEx extends Thread {
    public static void main(String[] a) {

        Thread c = new Thread(() -> {

            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());

        });
        c.start();


    }
}

