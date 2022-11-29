package com.thread.SaleTicket;

public class saleTicket implements Runnable {
    private int tickets = 200;
    private Object object = new Object();
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                synchronized (this) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "卖了" + tickets + "个票");
                        tickets--;
                    }
                }
            } else {
                saleticket();
            }
            x++;
        }

    }

    /*
    关键字synchronized 锁定的对象是this，所以上面的锁应该也是synchronized (this)
     */
    private synchronized void saleticket() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖了" + tickets + "个票");
            tickets--;
//                System.out.println(tickets);
        }
    }
}
