package com.moyu.codewars.ones_and_zeros;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryArrayToNumberTest {

    @Test
    public void convertBinaryArrayToInt() {
        assertEquals(1, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
        assertEquals(15, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
        assertEquals(6, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
        assertEquals(9, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
    }

    @Test
    public void convertBinaryArrayToInt2() {
        assertEquals(1, BinaryArrayToNumber.ConvertBinaryArrayToInt2(new ArrayList<>(Arrays.asList(0,0,0,1))));
        assertEquals(15, BinaryArrayToNumber.ConvertBinaryArrayToInt2(new ArrayList<>(Arrays.asList(1,1,1,1))));
        assertEquals(6, BinaryArrayToNumber.ConvertBinaryArrayToInt2(new ArrayList<>(Arrays.asList(0,1,1,0))));
        assertEquals(9, BinaryArrayToNumber.ConvertBinaryArrayToInt2(new ArrayList<>(Arrays.asList(1,0,0,1))));
    }
}