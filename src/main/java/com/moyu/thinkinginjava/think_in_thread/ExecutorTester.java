package com.moyu.thinkinginjava.think_in_thread;

import java.util.concurrent.*;

/**
 * @program: thinking-in-java
 * @description:
 * @author: wangzibin
 * @create: 2019-02-19 17:26
 **/
public class ExecutorTester {

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        ExecutorService executorService2= new ThreadPoolExecutor(3,5
                ,30, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(16));
        for (int i=0;i<10;i++){
            executorService2.submit(new CodeTask(i));
        }
        System.out.println("完事");

    }
}
