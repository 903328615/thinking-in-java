package com.moyu.thinkinginjava.leetcode;

import java.util.Arrays;

/**
 * @author:WangZiBin
 * @description:无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class MaxLengthSubSolution {
    public static int lengthOfLongestSubstring(String s) {

        StringBuffer temp=new StringBuffer();
        int maxLength=0;
        if (!s.equals("")&&s!=null){
            for(int i=0;i<s.length();i++){
                if(temp.indexOf(String.valueOf(s.charAt(i)))==-1){
                    temp.append(s.charAt(i));
                }else {
                    maxLength=maxLength<temp.length()?temp.length():maxLength;
                    i=0;
                    s=s.substring(s.indexOf(s.charAt(i))+1);
                    System.out.println("出现了记录"+maxLength);
                    System.out.println("此时s="+s);
                    temp=new StringBuffer();
                    temp.append(s.charAt(i));
                }
                System.out.println(temp.toString());
            }
            maxLength=maxLength<temp.length()?temp.length():maxLength;
        }
        return maxLength;
    }

    public static int lengthOfLongestSubstringStar(String s) {

        int ans = 0;
        int[] vis = new int[257];
        int len = s.length();
        //记录左值，长度为遍历非重复值到左值长
        int left = -1;
        Arrays.fill(vis,-1);
        for(int i = 0; i < len; i++) {
            //每次循环判断当前字符是否重复重复则左值后移至当前重复值坐标
            if(vis[s.charAt(i)] > left) {
                left = vis[s.charAt(i)];
                System.out.println(left);
            }
            //计算当前最大子串长度
            ans = Math.max(ans,i - left);
            System.out.println("i="+i+" left="+left+" ans="+ans);
            //这里赋值目标字符出现最后位置
            vis[s.charAt(i)] = i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n= lengthOfLongestSubstringStar("pwwwwwwwwwwwwwkew");
        System.out.println(n);
    }
}
