package com.moyu.structure.list;

import java.io.Serializable;
import java.util.NoSuchElementException;

/**
 * @program: thinking-in-java
 * @description: 自定义链表
 * 单链表反转
 * 链表中环的检测
 * 两个有序链表的合并
 * 删除链表中倒数第n个节点
 * 求链表中间节点
 * @author: wangzibin
 * @create: 2019-04-01 10:50
 **/
public class MyLinkedList<E> implements Serializable {

    transient int size=0;

    transient Node<E> first;
    transient Node<E> last;

    private void linkFirst(E e){

    }

    public MyLinkedList() {
    }

    private static class Node<E>{
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
}

