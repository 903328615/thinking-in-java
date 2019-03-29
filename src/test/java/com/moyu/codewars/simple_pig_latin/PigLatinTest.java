package com.moyu.codewars.simple_pig_latin;

import org.junit.Test;

import static org.junit.Assert.*;

public class PigLatinTest {
    @Test
    public void FixedTests() {
        System.out.println("".isEmpty());
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("hisTay siay ymay tringsay !", PigLatin.pigIt("This is my string !"));
    }
}
