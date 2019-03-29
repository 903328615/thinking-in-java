package com.moyu.nowcoder.bytedancce.fight;

import java.util.Scanner;

/**
 * @program: thinking-in-java
 * @description:
 * @author: wangzibin
 * @create: 2019-03-16 11:13
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int [] a=new int[n];

        for (int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }

        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if (a[i]>a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        if (n>=m){
            System.out.println((double)a[0]);
            return;
        }
        if (m-n>n){
            System.out.println((double)a[0]/(m/n));
            return;
        }

        System.out.println((double)a[2*n-m]/2);

    }
}
