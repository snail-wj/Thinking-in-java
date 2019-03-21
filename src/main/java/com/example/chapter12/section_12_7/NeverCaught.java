package com.example.chapter12.section_12_7;

/**
 * @author wangjing
 * Created on 2019-03-22
 */
public class NeverCaught {
    static void f(){
        throw new RuntimeException("From f()");
    }

    static void g(){
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
