package com.moyu.leetcode;

/**
 * @program: thinking-in-java
 * @description: 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * @author: wangzibin
 * @create: 2019-04-17 15:22
 **/
public class LonggestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length<1){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        StringBuilder longestCommonPrefix = new StringBuilder();
        boolean isCommon = true;
        for (int i = 0; i < strs[0].length(); i++) {

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return longestCommonPrefix.toString();
                }
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    isCommon = false;
                }
            }
            if (isCommon) {
                longestCommonPrefix.append(strs[0].charAt(i));
            }
        }
        return longestCommonPrefix.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{}));
    }
}
