package com.example.chapter12.section_12_6;

/**
 * @author wangjing
 * Created on 2019-03-20
 * 表明元素0是栈顶元素，并且是调用序列中的最后一个方法的调用
 * 数组中的最后一个元素和栈底是调用序列中的第一个方法调用
 */
public class WhoCalled {
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste);
            }
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("---------------------------");
        g();
        System.out.println("---------------------------");
        h();
        System.out.println("---------------------------");
    }
}
