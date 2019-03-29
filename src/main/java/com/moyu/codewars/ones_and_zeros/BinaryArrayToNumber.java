package com.moyu.codewars.ones_and_zeros;

import java.util.List;

/**
 * @program: thinking-in-java
 * @description: Given an array of one's and zero's convert the equivalent binary value to an integer.
 * @author: wangzibin
 * @create: 2019-01-15 14:26
 **/
public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int length=binary.size()-1;
        int number=0;
        for (Integer s:binary){
            if (s!=0){
                number+=Math.pow(2,length);
            }
            length--;
        }

        return number;
    }

    public static int ConvertBinaryArrayToInt2(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }



}
