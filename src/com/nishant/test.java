package com.nishant;

public class test {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println(Thread.currentThread().getName());

//        World world =new World();
//        Thread thread = new Thread(world);
        World thread = new World();//NEW
        thread.start();//RUNNABLE
        System.out.println(Thread.currentThread().getName());

        for (; ; ) {
            System.out.println("Hello");

        }
    }
}
