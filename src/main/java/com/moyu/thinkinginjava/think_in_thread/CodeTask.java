package com.moyu.thinkinginjava.think_in_thread;

/**
 * @program: thinking-in-java
 * @description:
 * @author: wangzibin
 * @create: 2019-02-19 17:20
 **/
public class CodeTask implements Runnable {

    private final int codeId;

    public CodeTask(int codeId) {
        this.codeId = codeId;
    }

    @Override
    public void run() {
        System.out.println(codeId+" 号Codeing开启");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(codeId+" 号Codeing完成");
    }
}
