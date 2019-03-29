package com.moyu.nowcoder.bytedancce;

import java.util.*;

/**
 * @program: thinking-in-java
 * @description:
 * @author: wangzibin
 * @create: 2019-03-14 15:08
 **/
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x,y;
        int[] xs=new int[n];

        Map<Integer, Integer> pointList = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            x=scanner.nextInt();
            y=scanner.nextInt();
            xs[i]=x;
            pointList.put(x, y);
        }


        for (Map.Entry<Integer, Integer> entry : pointList.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
