package org.programs.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExecutorExample {
    public static void main(String[] args) {
        int numberOfTasks = 10;
        int poolSize = 5;

        ExecutorService executor = Executors.newFixedThreadPool(poolSize);

        for (int i = 0; i < numberOfTasks; i++) {
            int taskId = i;
            executor.execute(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Task " + taskId + " is being executed by " + threadName);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Thread was interrupted: " + e.getMessage());
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " completed by " + threadName);
            });
        }
        executor.shutdown();
    }
}

