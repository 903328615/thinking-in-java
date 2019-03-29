package com.moyu.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    @Test
    public void longestPalindrome() {
        LongestPalindromicSubstring longestPalindromicSubstring=new LongestPalindromicSubstring();
        System.out.println(longestPalindromicSubstring.longestPalindrome("cbbd"));
    }

    @Test
    public void palindrome() {
        LongestPalindromicSubstring longestPalindromicSubstring=new LongestPalindromicSubstring();
        System.out.println(longestPalindromicSubstring.palindrome("babad"));
    }
}