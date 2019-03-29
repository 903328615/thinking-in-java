package com.moyu.thinkinginjava.think_in_thread;

/**
 * @program: thinking-in-java
 * @description:
 * @author: wangzibin
 * @create: 2019-02-10 10:35
 **/
public class LoginServlet {
    private static String usernameRef;

    private static String passwordRef;

    synchronized public static void doPost(String username, String password) {
        usernameRef = username;
        try {
            if (username.equals("b")) {

                Thread.sleep(5000);
                passwordRef=password;
            }
            System.out.println("username="+usernameRef+" password="+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LoginA a=new LoginA();
        LoginB b=new LoginB();
        Thread threadA=new Thread(a);
        Thread threadB=new Thread(b);

        threadB.start();
        threadA.start();
    }
}

class LoginA implements Runnable{

    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
class LoginB implements Runnable{

    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
