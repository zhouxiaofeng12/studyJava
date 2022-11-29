package com.thread;

/**
 * 1.继承Thread
 * 2.重写run方法
 * 3.
 */
public class MyThread extends Thread{

    public MyThread(){

    }

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+":"+i);
        }
    }

    /**
     * private volatile String name;
     *
     *      public Thread() {
     *         init(null, null, "Thread-" + nextThreadNum(), 0);
     *     }
     *
     *       private void init(ThreadGroup g, Runnable target, String name,
     *                       long stackSize) {
     *         init(g, target, name, stackSize, null, true);
     *     }
     *
     *      private void init(ThreadGroup g, Runnable target, String name,
     *                       long stackSize, AccessControlContext acc,
     *                       boolean inheritThreadLocals) {
     *         if (name == null) {
     *             throw new NullPointerException("name cannot be null");
     *         }
     *
     *         this.name = name;
     *
     *  public final String getName() {
     *         return name;
     *     }
     *
     *
     *    setName 重新赋值
     *
     *    public final synchronized void setName(String name) {
     *         checkAccess();
     *         if (name == null) {
     *             throw new NullPointerException("name cannot be null");
     *         }
     *
     *         this.name = name;
     *         if (threadStatus != 0) {
     *             setNativeName(name);
     *         }
     *     }
     *
     *
     */
}
