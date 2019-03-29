package com.moyu.thinkinginjava.sort;

/**
 * @program: thinking-in-java
 * @description: 归并排序
 * @author: wangzibin
 * @create: 2019-01-21 15:39
 **/
public class MergeSort {

    int[] ascendSort(int[] nums){

        if (nums[0]>nums[1]){
            int temp=nums[0];
            nums[0]=nums[1];
            nums[1]=temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Integer.valueOf(null));
    }

}
