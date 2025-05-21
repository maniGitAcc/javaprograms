package org.programs.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorExample {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task1 = () -> System.out.println("Task 1: Executed after 2 seconds");
        Runnable task2 = () -> System.out.println("Task 2: Executed every 3 seconds");

        // Schedule task1 to run once after an initial delay of 2 seconds
        ScheduledFuture<?> future1 = scheduler.schedule(task1, 2, TimeUnit.SECONDS);

        // Schedule task2 to run repeatedly, with an initial delay of 1 second, and subsequent executions every 3 seconds.
        ScheduledFuture<?> future2 = scheduler.scheduleAtFixedRate(task2, 1, 3, TimeUnit.SECONDS);

        // Keep the program running for a while to observe the scheduled tasks
        try {
            Thread.sleep(10000); // Sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cancel the scheduled tasks (optional, if you want to stop them before they complete)
        future1.cancel(true);
        future2.cancel(true);

        scheduler.shutdown();
    }
}
