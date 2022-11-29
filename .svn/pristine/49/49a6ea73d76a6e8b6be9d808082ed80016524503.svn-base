package com.thread.priority;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1=new ThreadPriority();
        ThreadPriority tp2=new ThreadPriority();
        ThreadPriority tp3=new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

        tp2.setPriority(10);
        tp1.setPriority(1);
        tp3.setPriority(9);

       /* System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());*/

        tp1.start();
        tp2.start();
        tp3.start();

    }
}
