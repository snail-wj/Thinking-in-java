package com.example.chapter13.section_13_6;

/**
 * @author wangjing
 * Created on 2019-03-28
 *
 */
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
        System.out.println("abc".matches("[abc]"));
        System.out.println("a".matches("[abc]"));
        System.out.println("ac".matches("[abc]"));
        System.out.println("ab".matches("[abc]"));
        System.out.println("b".matches("[abc]"));
    }
}
