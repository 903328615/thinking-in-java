package com.moyu.leetcode;

import java.util.Arrays;

/**
 * @program: thinking-in-java
 * @description: 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * @author: wangzibin
 * @create: 2019-04-02 17:43
 **/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return String.valueOf(c1).equals(String.valueOf(c2));
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int[] x=new int[26];
        int[] y=new int[26];
        for (char ch:s.toCharArray()){
            x[ch-'a']++;
        }
        for (char ch:t.toCharArray()){
            y[ch-'a']++;
        }
        for (int i=0;i<26;i++){
            if (x[i]!=y[i]){
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram3(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }

        int[] arr=new int[26];
        for (char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        for (char ch:t.toCharArray()){
            arr[ch-'a']--;
        }
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }

}
