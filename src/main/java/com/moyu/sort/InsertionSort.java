package com.moyu.sort;

/**
 * @program: thinking-in-java
 * @description: 插入排序
 * @author: wangzibin
 * @create: 2019-04-02 10:24
 **/
public class InsertionSort {

    public static void sort(int[] nums) {
        int size = nums.length;
        if (size <= 1) {
            return;
        }
        for (int i = 1; i < size; i++) {
            //待插入有序数组的元素value
            int value = nums[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (nums[j] > value) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = value;
        }
    }

    public static String sort(String str) {
        int size = str.length();

        if (size <= 1) {
            return str;
        }
        char[] s = str.toCharArray();
        for (int i = 1; i < size; i++) {
            //待插入有序数组的元素value
            char value = s[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (s[j] > value) {
                    s[j + 1] = s[j];
                } else {
                    break;
                }
            }
            s[j + 1] = value;
        }
        return String.valueOf(s);
    }

    public static void shellSort(int[] array) {
        int number = array.length / 2;
        int i;
        int j;
        int temp;
        while (number >= 1) {
            for (i = number; i < array.length; i++) {
                temp = array[i];
                j = i - number;
                while (j >= 0 && array[j] < temp) { //需要注意的是，这里array[j] < temp将会使数组从大到小排序。
                    array[j + number] = array[j];
                    j = j - number;
                }
                array[j + number] = temp;
            }
            number = number / 2;
        }
    }

}
