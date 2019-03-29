package com.moyu.nowcoder.bytedancce.fight;

import java.util.Scanner;

/**
 * @program: thinking-in-java
 * @description:
 * @author: wangzibin
 * @create: 2019-03-16 09:54
 **/
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String[] bugWord=new String[n];
        for (int i=0;i<n;i++){
            bugWord[i]=scanner.nextLine();
        }
        char[][] result=new char[n][];

        for (int i=0;i<n;i++){
            int count=0;
            char[] temp=new char[bugWord[i].length()];
            temp[0]=bugWord[i].charAt(0);
            int num=0;
            for (int j=1;j<bugWord[i].length();j++){

                temp[j]=bugWord[i].charAt(j);
                if (temp[j-1]==temp[j]){
                    num++;
                    if (num==3){
                        result[i][count++]=temp[j-1];
                        result[i][count++]=temp[j-1];
                        num=0;
                    }
                }else {
                    result[i][count++]=temp[j-1];
                }

            }
        }


    }



}


