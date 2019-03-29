package com.moyu.thinkinginjava.leetcode;

/**
 * @author:WangZiBin
 * @description:
 */
public class MaxProFitSolution {
    public static int maxProfit(int[] prices) {
        if (prices.length<1){
            return 0;
        }
        int buyPoint=0;
        int sellPoint=0;
        int sum=0;
        for (int i=1;i<prices.length;i++){

            if (sellPoint>buyPoint&&prices[i]<prices[sellPoint]){
                sum+=(prices[sellPoint]-prices[buyPoint]);
                sellPoint=buyPoint=i;
                continue;
            }
            if (prices[i]<prices[buyPoint]){
                sellPoint=buyPoint=i;
            }
            if (prices[i]>prices[sellPoint]){
                sellPoint=i;
            }
        }
        if (prices[prices.length-1]>prices[buyPoint]){
            sum+=(prices[prices.length-1]-prices[buyPoint]);
        }
        return sum;
    }

    public static int maxProfit2(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int i = 0;
        int max = 0;
        while(i < nums.length){
            //找到附近最小的数
            while(i < nums.length - 1 && nums[i+1] <= nums[i])
                i++;
            int min = nums[i];
            //找到附近最大的数
            while(i < nums.length - 1 && nums[i+1] >= nums[i])
                i++;
            max += (i < nums.length) ? (nums[i++] - min) : 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] parices={};
        System.out.println(maxProfit(parices));
    }
}
