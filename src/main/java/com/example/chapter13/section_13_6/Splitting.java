package com.example.chapter13.section_13_6;

import java.util.Arrays;

/**
 * @author wangjing
 * Created on 2019-03-28
 *
 *  \W表示非单词字符[^/w](^ = 非)， \w表示一个单词字符[a-zA-Z0-9]
 */
public class Splitting {
    public static void main(String[] args) {
        String str1 = "I like you ! do,you,know,it!";
        System.out.println(Arrays.asList(str1.split(" ")));
        System.out.println(Arrays.asList(str1.split("\\W+")));
        System.out.println(Arrays.asList(str1.split("w\\W+")));
    }
}
