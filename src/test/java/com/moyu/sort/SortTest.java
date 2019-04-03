package com.moyu.sort;

import org.junit.Test;

import java.util.Arrays;



public class SortTest {

    @Test
    public void insertionSort() {
        String s = "anagram";
        String s2 = "nagaram";
        System.out.println(MergeSort.sortChar(s));

        System.out.println(MergeSort.sortChar(s2));
        char[] c1=s.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(String.valueOf(c1).equals(String.valueOf(c2)));

    }

    @Test
    public void bubbleSort() {

        int[] nums = {1, 5, 6, 2, 3, 4, 4, 5, 6, 2, 6, 8, 9, 2, 7, 5, 3};
        Arrays.stream(nums).forEach(System.out::print);
        System.out.println();
        BubbleSort.sort(nums);
        Arrays.stream(nums).forEach(System.out::print);
    }



    @Test
    public void mergeSort() {
        int[] nums = {1, 5, 6, 2, 3, 4, 4, 5, 6, 2, 6, 8, 9, 2, 7, 5, 3};
        Arrays.stream(nums).forEach(System.out::print);
        System.out.println();
        MergeSort.mergeSort(nums,nums.length);
        Arrays.stream(nums).forEach(System.out::print);
    }
}