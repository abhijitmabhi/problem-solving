package com.ama.Y2026;

public class Multithreading {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();

        Thread th = new Thread(myThread);
        Thread th2 = new Thread(myThread2);

        th.start();
        th2.start();
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Value " + i);

                if (i == 3) {
                    throw new RuntimeException();
                }

                Thread.sleep(1000);
            } catch (RuntimeException e) {
                System.out.println("Caught exception at i = " + i + ", continuing...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
