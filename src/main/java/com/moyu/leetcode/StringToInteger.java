package com.moyu.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: thinking-in-java
 * @description: 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 * <p>
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 * <p>
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * <p>
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
 * <p>
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
 * <p>
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0。
 * @author: wangzibin
 * @create: 2019-04-15 17:57
 **/
public class StringToInteger {
    public static int myAtoi(String str) {
        str = str.trim();

        String pattern = "^(\\-|\\+)?\\d+(\\.\\d+)?$";
        Pattern r = Pattern.compile(pattern);
        str = str.split(" ")[0];
        str = str.split("\\.")[0];
        int cutPos = 0;
        for (int i = 1; i < str.length(); i++) {
            cutPos = i;

            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                cutPos--;
                break;
            }
        }
        if (str.length() > 1) {

            str = str.substring(0, cutPos + 1);
        }

        Matcher m = r.matcher(str);
        if (m.matches()) {

            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                if (str.charAt(0) == '-') {
                    return Integer.MIN_VALUE;

                }
                return Integer.MAX_VALUE;
            }

        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("1a"));
        //System.out.println(".1a".substring(0,1));
    }
}
