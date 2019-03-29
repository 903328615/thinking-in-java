package com.moyu.codewars.reverse_polish_notation_calculator;


import java.util.Stack;

/**
 * @program: thinking-in-java
 * @description:Your job is to create a calculator which evaluates expressions in Reverse Polish notation.
 * @author: wangzibin
 * @create: 2019-01-18 11:11
 **/
public class Calc {

    public double evaluate(String expr) {
        if (expr.isEmpty()){
            return 0;
        }
        String[] exprs=expr.split(" ");
        // TODO: Your awesome code here
        Stack<Double> strings = new Stack<>();
        for (String s:exprs) {
            switch (s) {
                case "+":
                    strings.push(strings.pop()+strings.pop());
                    break;
                case "-":
                    strings.push(-(strings.pop()-strings.pop()));
                    break;
                case "*":
                    strings.push(strings.pop()*strings.pop());
                    break;
                case "/":
                    strings.push(1.0f/(strings.pop()/strings.pop()));
                    break;
                default:
                    strings.push(Double.valueOf(s));
                    break;

            }
        }
        return strings.pop();
    }
}
