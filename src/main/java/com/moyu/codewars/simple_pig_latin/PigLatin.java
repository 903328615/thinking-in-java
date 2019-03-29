package com.moyu.codewars.simple_pig_latin;

import java.util.regex.Pattern;

/**
 * @program: thinking-in-java
 * @description:Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 * @author: wangzibin
 * @create: 2019-01-18 16:10
 **/
public class PigLatin {
    public static String pigIt(String str) {
        // Write code here

        String reg="[a-zA-Z]";
        Pattern pattern=Pattern.compile(reg);
        String[] strs=str.split(" ");
        String result="";
        for(String s:strs){
            if (pattern.matcher(s).find()){
                result+=(s.substring(1, s.length())+s.charAt(0)+"ay ");
            }else {
                result+=s+" ";
            }

        }
        return result.substring(0,result.length()-1);
    }
}
