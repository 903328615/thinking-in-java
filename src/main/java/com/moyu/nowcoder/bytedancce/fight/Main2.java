package com.moyu.nowcoder.bytedancce.fight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: thinking-in-java
 * @description:
 * @author: wangzibin
 * @create: 2019-03-16 10:38
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int total=scanner.nextInt();
        Persion[][] persionList=new Persion[total][100001];
        int [] n=new int [total];
        int [] result=new int [total];
        for (int i=0;i<total;i++){
            n[i]=scanner.nextInt();
            for (int j=1;j<=n[i];j++){
                persionList[i][j]=new Persion(scanner.nextInt());
            }
            persionList[i][0]=persionList[i][n[i]];
        }

        for (int i=0;i<total;i++){

            for (int j=1;j<n[i];j++){
                if (persionList[i][j].num>persionList[i][j-1].num){
                    persionList[i][j].gift=persionList[i][j-1].gift+1;
                }else if (persionList[i][j].num>persionList[i][j+1].num){
                    persionList[i][j].gift=persionList[i][j+1].gift+1;
                }
            }
            if (persionList[i][n[i]-1].num>persionList[i][n[i]-2].num){
                persionList[i][n[i]-1].gift=persionList[i][n[i]-2].gift+1;
            }

            if (persionList[i][n[i]].num<=persionList[i][n[i]-1].num&&persionList[i][0].num>persionList[i][1].num){
                persionList[i][n[i]].gift=persionList[i][1].gift+1;
            }
        }
        for (int i=0;i<total;i++){

            for (int j=1;j<=n[i];j++){
                result[i]+=persionList[i][j].gift;
            }

        }
        for (int i=0;i<total;i++){
            System.out.println(result[i]);
        }


    }
}
class Persion{
    int num;
    int gift=1;

    public Persion(int num) {
        this.num = num;
    }
}
