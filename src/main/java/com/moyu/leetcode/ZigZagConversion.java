package com.moyu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: thinking-in-java
 * @description: 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * @author: wangzibin
 * @create: 2019-04-15 16:20
 **/
public  class ZigZagConversion {

    public static String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i=0;i<numRows;i++){
            rows.add(new StringBuilder());
        }

        int midNum=numRows-2;
        int i=0;
        while (i<s.length()){
            for (int j=0;j<numRows&&i<s.length();j++,i++){
                rows.get(j).append(s.charAt(i));
            }
            for (int k=0;k<midNum&&i<s.length();k++,i++){
                rows.get(numRows-k-2).append(s.charAt(i));
            }
        }
        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows){
            ret.append(row);
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }
}
