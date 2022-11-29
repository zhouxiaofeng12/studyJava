package com.thread;

public class MyThreadDemo {

    public static void main(String[] args) {

//        MyThread myThread=new MyThread();
//        MyThread myThread2=new MyThread();
//
//
//        myThread.setName("高铁");
//        myThread2.setName("飞机");
        MyThread myThread=new MyThread("高铁");
        MyThread myThread1=new MyThread("飞机");

        /**
         * run方法并没有启动我们的线程
         */
//        myThread.run();
//        myThread2.run();
        myThread.start();
        myThread1.start();

//        new Thread(() -> {
//            for (int i = 0; i < 100 ; i++) {
//                System.out.println("string1-"+i);
//
//            }
//        }).start();
//
//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 100 ; i++) {
//                    System.out.println("string2-"+i);
//
//                }
//            }
//        }.start();

    }
}
