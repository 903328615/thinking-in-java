package com.moyu.leetcode;

import java.util.Arrays;

/**
 * @program: thinking-in-java
 * @description:给定一个整数数组  nums 和一个正整数 k，找出是否有可能把这个数组分成 k 个非空子集，其总和都相等。
 * @author: wangzibin
 * @create: 2019-04-17 11:05
 **/
public class PartitionToKEqualSumSubsets {


    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int avg=sum/k;
        if (sum%k!=0){
            return false;
        }
        Arrays.sort(nums);
        if (avg<nums[nums.length-1]){
            return false;
        }
        int[] arr=new int[k];
        Arrays.fill(arr,avg);
        return help(nums,nums.length-1,arr,k);
    }

    boolean help(int[] nums, int cur, int[] arr, int k){
        if (cur<0){
            return true;
        }
        for (int i=0;i<k;i++){
            if (arr[i]==nums[cur]||(cur>0&&arr[i]-nums[cur]>=nums[0])){
                arr[i]-=nums[cur];
                if (help(nums,cur-1,arr,k)){
                    return true;
                }
                arr[i]+=nums[cur];
            }
        }
        return false;
    }

}
