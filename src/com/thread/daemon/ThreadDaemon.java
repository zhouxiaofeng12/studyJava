package com.thread.daemon;

public class ThreadDaemon extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+":"+i);
        }
    }
}
