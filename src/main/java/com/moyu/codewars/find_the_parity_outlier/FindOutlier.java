package com.moyu.codewars.find_the_parity_outlier;

/**
 * @program: thinking-in-java
 * @description:
 * @author: wangzibin
 * @create: 2019-01-17 17:47
 **/
public class FindOutlier {
    static int find(int[] integers){

        if (Math.abs(integers[0]%2)==Math.abs(integers[1]%2)&&Math.abs(integers[1]%2)==0){
            for (int i=2;i<integers.length;i++){
                if (Math.abs(integers[i]%2)==1){
                    return integers[i];
                }
            }
        }else if (Math.abs(integers[0]%2)==Math.abs(integers[1]%2)&&Math.abs(integers[1]%2)==1){
            for (int i=2;i<integers.length;i++){
                if (Math.abs(integers[i]%2)==0){
                    return integers[i];
                }
            }
        }else {
            if (Math.abs(integers[0]%2)==Math.abs(integers[2]%2)){
                return integers[1];
            }else{
                return integers[0];
            }
        }
        return 0;

    }
}
