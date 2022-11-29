package com.thread.jionDemo;

public class ThreadJionDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadJion threadJion1 = new ThreadJion();
        ThreadJion threadJion2 = new ThreadJion();

        threadJion1.setName("康熙");
        threadJion2.setName("雍正");

        threadJion1.start();
        threadJion1.join();

        threadJion2.start();

    }
}
