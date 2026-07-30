package com.ama.remind;

public class VolatileLearn {
    public static volatile boolean keepLooping = true;

    public static void main(String[] args) throws InterruptedException {
        Thread looper = new Thread(() -> {
           long count = 0;

           while (keepLooping) {
               count++;
           }

            System.out.println("Looper finished with count: " + count);
        });

        looper.start();
        Thread.sleep(100);

        keepLooping = false;

        System.out.println("KeepLooping value changed to False");
    }
}
