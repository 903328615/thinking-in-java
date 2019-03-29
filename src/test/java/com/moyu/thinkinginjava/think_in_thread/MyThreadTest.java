package com.moyu.thinkinginjava.think_in_thread;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyThreadTest {

    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.setName("讨逆");
        thread.start();

        try {
            Thread.sleep(100);
            thread.interrupt();
            System.out.println(thread.getName()+":"+thread.isInterrupted());
            System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void run() {
        MyThread thread=new MyThread();
        thread.setName("讨逆");
        thread.start();

        try {
            Thread.sleep(100);
            thread.interrupt();
            System.out.println(thread.getName()+":"+thread.isInterrupted());
            System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test(){
        //Thread.currentThread().interrupt();
        System.out.println("1="+Thread.interrupted());
        System.out.println("2="+Thread.interrupted());
    }
}

