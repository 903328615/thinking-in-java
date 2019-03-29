package com.moyu.nowcoder.bytedancce;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * @program: thinking-in-java
 * @description: 给定一个数组序列, 需要求选出一个区间,
 * 使得该区间是所有区间中经过如下计算的值最大的一个：
 * 区间中的最小数 * 区间所有数的和最后程序输出经过计算后的最大值即可，不需要输出具体的区间。
 * 如给定序列  [6 2 1]则根据上述公式, 可得到所有可以选定各个区间的计算值:
 * @author: wangzibin
 * @create: 2019-03-15 13:43
 **/
public class Main2 {


    /**
    *算法最长复杂度O(n2) 最短O(n)
    */
    /**
    *思路
     * 遍历所有数
     * 将遍历的每个数定为最小值
     * 尽可能左右拓展区间长度并且保证当前数最小
     * 满足条件区间最大时为此数对应区间和乘积最大
    */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int count=scanner.nextInt();
        int[] list=new int[count];
        for (int i=0;i<count;i++){
            list[i]=scanner.nextInt();
        }



        int result=0;
        int min;
        for (int i=0;i<count;i++){
            int sum=0;
            min=list[i];
            for (int j=i;j<count;j++){
                if (list[j]<min){
                    break;
                }
                sum+=list[j];
            }
            for (int j=i-1;j>=0;j--){
                if (list[j]<min){
                    break;
                }
                sum+=list[j];
            }
            int temp=sum*min;
            if (temp>result){
                result=temp;
            }
        }

        System.out.println(result);

    }

}
