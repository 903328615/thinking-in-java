package com.moyu.codewars.find_the_odd_int;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: thinking-in-java
 * @description: Given an array, find the int that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 * @author: wangzibin
 * @create: 2019-01-15 10:20
 **/
public class FindOdd {

    public static int findIt(int[] a) {

        Map<Integer, Integer> map = new HashMap<>(16);
        AtomicInteger j = new AtomicInteger();
        Arrays.stream(a).forEach(
                s -> {
                    j.set(map.get(s)==null?0:map.get(s));
                    map.put(s, j.get() + 1);
                }
        );

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()%2==1){
                return entry.getKey();
            }
        }
        return 0;
    }

    public static int findIt2(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}

