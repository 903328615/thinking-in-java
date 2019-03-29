package com.moyu.thinkinginjava.think_in_thread;

/**
 * @program: thinking-in-java
 * @description:
 * @author: wangzibin
 * @create: 2019-02-10 22:19
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i=0;i<50000;i++){
            if (interrupted()){
                System.out.println("我被停止了");
                return;
            }
            System.out.println("i="+i);
        }
        System.out.println("我是漏网之鱼");
    }
}
