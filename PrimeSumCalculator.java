package com.classdemo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PrimeSumCalculator {
    public static void main(String[] args) {
        int limit = 1000; 
        int numThreads = 4; // Number of threads

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int segmentSize = limit / numThreads;
        int start = 2; // Start from 2 as 1 is not a prime number
        int end = segmentSize;

        // List to hold partial sums
        PrimeSumTask[] tasks = new PrimeSumTask[numThreads];

        for (int i = 0; i < numThreads; i++) {
            tasks[i] = new PrimeSumTask(start, end);
            executor.execute(tasks[i]);
            start = end + 1;
            end = (i == numThreads - 2) ? limit : end + segmentSize;
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long totalSum = 0;
        for (PrimeSumTask task : tasks) {
            totalSum += task.getPartialSum();
        }

        System.out.println("Total Sum of Prime Numbers up to " + limit + ": " + totalSum);
    }
}

class PrimeSumTask implements Runnable {
    private final int start;
    private final int end;
    private long partialSum;

    public PrimeSumTask(int start, int end) {
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    @Override
    public void run() {
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                partialSum += num;
            }
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
