package com.moyu.codewars.find_the_odd_int;

import org.junit.Test;

import java.util.function.Consumer;

import static org.junit.Assert.*;

public class FindOddTest {

    @Test
    public void findIt() {
        assertEquals(5, FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        assertEquals(-1, FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, FindOdd.findIt(new int[]{10}));
        assertEquals(10, FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(1, FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }

    @Test
    public void findIt2() {
        assertEquals(5, FindOdd.findIt2(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        assertEquals(-1, FindOdd.findIt2(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, FindOdd.findIt2(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, FindOdd.findIt2(new int[]{10}));
        assertEquals(10, FindOdd.findIt2(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(1, FindOdd.findIt2(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }

    @Test
    public void test(){
        Consumer consumer=System.out::println;
        consumer.accept("nihso");
    }
}