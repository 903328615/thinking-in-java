package com.moyu.thinkinginjava.leetcode;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: thinking-in-java
 * @description:
 * @author: wangzibin
 * @create: 2019-03-01 16:26
 **/
public class TimeTest {

    @Test
    public void test(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmm");
        String ymdhhmm = simpleDateFormat.format(new Date());
        String ymd = ymdhhmm.substring(0, 8);
        String hh = ymdhhmm.substring(8, 10);
        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println(ymd);
        System.out.println(hh);
    }
}
