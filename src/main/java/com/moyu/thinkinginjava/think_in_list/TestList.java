package com.moyu.thinkinginjava.think_in_list;

import com.moyu.thinkinginjava.think_in_list.util.ArrayList;

import java.util.List;

/**
 * @author:WangZiBin
 * @description:
 */
public class TestList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(16);
        list.add("你好");
        list.stream().forEach(s-> System.out.println(s));
    }
}
