package com.moyu.structure.priorityqueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @program: thinking-in-java
 * @description: 记录TopK
 * @author: wangzibin
 * @create: 2019-03-22 14:56
 **/
public class TopK {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(10);

        ArrayList<Integer> list=new ArrayList<>(150);
        for (int i=0;i<50;i++){
            list.add(i);
            if (priorityQueue.size()<10){
                priorityQueue.add(i);
            }
        }
        for (int i=0;i<50;i++){
            if (list.get(i)>priorityQueue.element()){
                priorityQueue.remove();
                priorityQueue.add(list.get(i));
            }
        }

        for (Integer integer:priorityQueue){
            System.out.println(integer);
        }
    }
}
