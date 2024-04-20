package com.classdemo;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {
    private static final int MAX_CAPACITY = 5;
    private static Queue<Integer> buffer = new LinkedList<>();

    public static void main(String[] args) {
        Thread producer = new Thread(new Producer());
        Thread consumer = new Thread(new Consumer());

        producer.start();
        consumer.start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            int item = 1;
            while (true) {
                try {
                    produce(item++);
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private void produce(int item) throws InterruptedException {
            synchronized (buffer) {
                while (buffer.size() == MAX_CAPACITY) {
                    System.out.println("Buffer is full. Producer is waiting...");
                    buffer.wait();
                }

                buffer.offer(item);
                System.out.println("Produced: " + item);
                buffer.notify(); // Notify consumer that an item is available
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    consume();
                    Thread.sleep(2000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private void consume() throws InterruptedException {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    System.out.println("Buffer is empty. Consumer is waiting...");
                    buffer.wait();
                }

                int item = buffer.poll();
                System.out.println("Consumed: " + item);
                buffer.notify(); 
            }
        }
    }
}
