package com.moyu.thinkinginjava.leetcode;

/**
 * @author:WangZiBin
 * @description:
 */
public class RemoveDuplicatesSolution {

    public static int removeDuplicates(int[] nums) {
        int length=0;
        int cursor=0;
        for(;cursor<nums.length;cursor++){
            if(nums[cursor]!=nums[length]){
                length++;
                nums[length]=nums[cursor];
            }
        }
        return length+1;
    }

    public static void main(String[] args) {
        int[] nums={0,0,0,1,1,2,2,3,3,4};
        int len=removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
