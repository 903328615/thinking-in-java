package com.moyu.thinkinginjava.thinking_in_string;

/**
 * @author:WangZiBin
 * @description:
 */
public class WhatAboutIntern {
    public static void main(String[] args) {
        String strA="nice";
        String strB=new String("nice");

        System.out.println(strB.intern()==strA);

    }
}
