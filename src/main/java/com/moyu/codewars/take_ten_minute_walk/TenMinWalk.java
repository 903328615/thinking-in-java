package com.moyu.codewars.take_ten_minute_walk;

/**
 * @program: thinking-in-java
 * @description:
 * @author: wangzibin
 * @create: 2019-01-17 15:36
 **/
public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        if (walk.length!=10){
            return false;
        }
        int x=0;
        for (char s:walk){
            if (s=='n'){
                s='s';
                x-=s;
                continue;
            }else if(s=='e'){
                s='w';
                x-=s;
                continue;
            }
            x+=s;
        }
        return x==0;
    }

    public static void main(String[] args) {
        System.out.println('w');
    }
}
