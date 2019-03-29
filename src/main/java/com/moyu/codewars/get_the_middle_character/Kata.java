package com.moyu.codewars.get_the_middle_character;

/**
 * @program: thinking-in-java
 * @description:You are going to be given a word. Your job is to return the middle character
 * of the word. If the word's length is odd, return the middle character.
 * If the word's length is even, return the middle 2 characters.
 * @author: wangzibin
 * @create: 2019-01-18 10:33
 **/
public class Kata {
    public static String getMiddle(String word) {
        //Code goes here!
        if(word.length()%2==0){
            return word.substring(word.length()/2-1,word.length()/2+1);
        }else {
            return String.valueOf(word.charAt(word.length()/2));
        }
    }
}
