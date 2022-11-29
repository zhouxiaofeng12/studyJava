package com.thread.MyRunnable;


public class MyRunnableDemo {

    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        MyRunnable myRunnable1=new MyRunnable();

//        /**
//         * 不能直接run，因为这样就是直接调用run，需要c++调用
//         */
//        myRunnable.run();
//        myRunnable1.run();

        Thread thread = new Thread(myRunnable);
        Thread thread1 = new Thread(myRunnable1);
        thread.start();
        thread1.start();
    }

}
