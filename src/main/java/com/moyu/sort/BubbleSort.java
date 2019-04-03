package com.moyu.sort;

import java.util.Arrays;

/**
 * @program: thinking-in-java
 * @description: 冒泡排序
 * @author: wangzibin
 * @create: 2019-04-02 10:06
 **/
public class BubbleSort {

    public static void sort(int[] nums){
        int size=nums.length;
        if (size<=1){
            return;
        }

        for(int i=0;i<size;i++){
            //标识是否存在数据交互，若没有则退出
            boolean flag=false;
            for (int j=0;j<size-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag){
                break;
            }
        }
    }



}
