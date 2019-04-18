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
    public static String longestPalindrome(String s) {
        if (s.isEmpty()){
            return "";
        }
        if (s.length()==1){
            return s;
        }
        int start=0,end=0;

        for (int i=0;i<s.length()-1;i++){
            int len1=expandAroundCenter(s,i,i);
            int len2=expandAroundCenter(s,i,i+1);
            int len=Math.max(len1,len2);
            if (len>end-start){
                start=i-(len-1)/2;
                end=i+len/2+1;
            }

        }

        return s.substring(start,end);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L=left,R=right;
        while(L>=0&&R<s.length()&&s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("a"));
        System.out.println("babad".substring(0,3));
    }

}
