package org.programs.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {
    public static void main(String[] args) {
        // Create a CachedThreadPool
        ExecutorService executor = Executors.newCachedThreadPool();

        // Submit tasks to the executor
        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task " + taskNumber + " is being executed by " + Thread.currentThread().getName());
                try {
                    // Simulate some work
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskNumber + " completed");
            });
        }

        // Shut down the executor
        executor.shutdown();
    }
}
