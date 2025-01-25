package com.nishant;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");//Running
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }//TIMED_WAITING

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());//New
        t1.start();
        System.out.println(t1.getState());//RUNNABLE
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());//TERMINATIND

        //main
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getState());




    }
}
