package com.moyu.leetcode;

/**
 * @program: thinking-in-java
 * @description: 最长回文子串
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * @author: wangzibin
 * @create: 2019-03-22 17:45
 **/
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String result=s.substring(0,0);
        for (int i=0;i<s.length();i++){
            int num=s.length();
            for (int j=i;j<s.length();j++){
                if (palindrome(s.substring(i,num))){
                    if ((num-j)>result.length()){
                        result=s.substring(i,num);
                    }
                }
                num--;
            }
        }
        return result;
    }

    public boolean palindrome(String s){
        if (s.length()==1){
            return true;
        }
        if (s.length()==2){
            if (s.charAt(0)==s.charAt(1)){
                return true;
            }else {

                return false;
            }
        }
        int per=s.length()/2-1;
        int aft=s.length()/2;
        if (s.length()%2==1){
            aft++;
        }
        while(true){
            if (per<0)
            {
                break;
            }
            if (s.charAt(per--)!=s.charAt(aft++)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(5/2);
    }

}
