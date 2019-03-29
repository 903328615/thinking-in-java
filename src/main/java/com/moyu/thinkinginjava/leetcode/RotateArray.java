package com.moyu.thinkinginjava.leetcode;

import java.util.Arrays;

/**
 * @program: thinking-in-java
 * @description: 旋转数组  给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * @author: wangzibin
 * @create: 2019-01-07 16:30
 **/
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int position=0;
        int temp;
        int changer=nums[0];

        for(int i=0;i<nums.length;i++){
            position=(position+k)%nums.length;
            temp=nums[position];
            nums[position]=changer;
            changer=temp;
        }

        Arrays.stream(nums).forEach(s-> System.out.print(s));
    }

    public static void main(String[] args) {
        rotate(new int[]{-1,-100,3,99},2);
    }

}
