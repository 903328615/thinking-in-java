package com.moyu.thinkinginjava.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author:WangZiBin
 * @description:寻找两个有序数组的中位数
 */
public class MedianArraySolution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num=concat(nums1,nums2);
        Arrays.parallelSort(num);


        int mi = num.length / 2;
        return num.length % 2 == 1 ? num[mi] : (num[mi - 1] + num[mi]) / 2.0;

    }
    public static  int[] concat(int[] first, int[] second) {
        int[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 ={3,4,5};
        Double s=findMedianSortedArrays(nums1,nums2);
        System.out.println(s);
    }
}
