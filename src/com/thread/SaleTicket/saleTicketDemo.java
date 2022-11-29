package com.thread.SaleTicket;

public class saleTicketDemo {
    public static void main(String[] args) {
        saleTicket sale=new saleTicket();
//        saleTicket sale2=new saleTicket();
//        saleTicket sale3=new saleTicket();

        /**
         * 3个线程抢一个线程运行，因为对象一样
         */

        Thread thread1 = new Thread(sale);
        Thread thread2 = new Thread(sale);
        Thread thread3 = new Thread(sale);

        thread1.setName("票务一店");
        thread2.setName("票务二店");
        thread3.setName("票务三店");

        thread2.start();
        thread1.start();
        thread3.start();
    }

}
