package com.moyu.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: thinking-in-java
 * @description:给定一个字符串 (s) 和一个字符模式 (p)。实现支持 '.' 和 '*' 的正则表达式匹配。
 * @author: wangzibin
 * @create: 2019-04-16 17:19
 **/
public class RegularExpressionMatcing {

    public static boolean isMatch(String s, String p) {

        return s.matches(p);
    }

    public static boolean isMatchPlus(String s, String p) {
        if (p.equals(".*")) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s = "aab";
        String p = "c*a*b";
        System.out.println(isMatch(s, p));
        System.out.println(isMatchPlus(s, p));
    }
}
