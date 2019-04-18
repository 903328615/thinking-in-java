package com.moyu.leetcode;

/**
 * @program: thinking-in-java
 * @description:判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @author: wangzibin
 * @create: 2019-04-16 17:00
 **/
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        String num=String.valueOf(x);
        int size=num.length();
        if (size==1){
            return true;
        }
        int start,end;
        if (size%2==1){
            start=size/2-1;
            end=size/2+1;
        }else {
            start=size/2-1;
            end=size/2;
        }
        while (start>0||end<size){
            if (num.charAt(start)!=num.charAt(end)){
                return false;
            }
            start--;
            end++;
        }
        return true;


    }
    public static boolean isPalindromePlus(int x) {

        if (x<0){
            return false;
        }else if (x<10){
            return true;
        }else {
            int num=x;
            int d=0;
            while (num>0){
                d=d*10+num%10;
                num/=10;
            }
            if (d==x){
                return true;
            }else {
                return false;
            }
        }


    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindromePlus(11222211));
    }
}
