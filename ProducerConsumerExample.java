//Write a Java program to create a producer-consumer scenario using the wait() and notify() methods for thread synchronization.
package com.classdemo;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {
    private static final int MAX_CAPACITY = 5; // Maximum capacity of the buffer
    private static Queue<Integer> buffer = new LinkedList<>(); // Shared buffer

    public static void main(String[] args) {
        // Creating and starting producer and consumer threads
        Thread producer = new Thread(new Producer());
        Thread consumer = new Thread(new Consumer());

        producer.start();
        consumer.start();
    }

    // Producer class that implements Runnable
    static class Producer implements Runnable {
        @Override
        public void run() {
            int item = 1; // Initial item to produce
            while (true) {
                try {
                    produce(item++); // Produce items incrementally
                    Thread.sleep(1000); // Sleep for 1 second after producing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // Method to produce an item
        private void produce(int item) throws InterruptedException {
            synchronized (buffer) {
                while (buffer.size() == MAX_CAPACITY) {
                    System.out.println("Buffer is full. Producer is waiting...");
                    buffer.wait(); // Wait if the buffer is full
                }

                buffer.offer(item); // Add item to the buffer
                System.out.println("Produced: " + item);
                buffer.notify(); // Notify consumer that an item is available
            }
        }
    }

    // Consumer class that implements Runnable
    static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    consume(); // Consume items from the buffer
                    Thread.sleep(2000); // Sleep for 2 seconds after consuming
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // Method to consume an item
        private void consume() throws InterruptedException {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    System.out.println("Buffer is empty. Consumer is waiting...");
                    buffer.wait(); // Wait if the buffer is empty
                }

                int item = buffer.poll(); // Remove item from the buffer
                System.out.println("Consumed: " + item);
                buffer.notify(); // Notify producer that space is available
            }
        }
    }
}

/*
Dry Run:

1. Initialization:
   - Buffer is empty.
   - MAX_CAPACITY is 5.
   - Producer and consumer threads are started.

2. Producer Thread:
   - Produces item 1.
   - Buffer: [1]
   - Sleeps for 1 second.

3. Consumer Thread:
   - Consumes item 1.
   - Buffer: []
   - Sleeps for 2 seconds.

4. Producer Thread:
   - Produces item 2.
   - Buffer: [2]
   - Sleeps for 1 second.

5. Producer Thread:
   - Produces item 3.
   - Buffer: [2, 3]
   - Sleeps for 1 second.

6. Consumer Thread:
   - Consumes item 2.
   - Buffer: [3]
   - Sleeps for 2 seconds.

7. This pattern continues with the producer and consumer alternating access to the buffer.

Expected Output (sample):
Produced: 1
Consumed: 1
Produced: 2
Produced: 3
Consumed: 2
Produced: 4
Produced: 5
Consumed: 3
Produced: 6
Buffer is full. Producer is waiting...
Consumed: 4
Produced: 7
Consumed: 5
Produced: 8

Notes:
- The producer produces items every 1 second.
- The consumer consumes items every 2 seconds.
- The buffer size is limited to 5 items.
- Synchronization ensures that the producer waits when the buffer is full and the consumer waits when the buffer is empty.
*/
