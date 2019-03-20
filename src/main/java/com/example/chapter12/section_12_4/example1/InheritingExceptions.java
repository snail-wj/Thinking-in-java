package com.example.chapter12.section_12_4.example1;

/**
 * @author wangjing
 * Created on 2019-03-20
 */
public class InheritingExceptions {
    public void f() throws Exception {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (Exception e) {
            e.printStackTrace(); //把错误打印到错误流中
            System.out.println(e.getMessage()); //e.getMessage()打印的是Exception的参数
            e.printStackTrace(System.out);
            e.printStackTrace(System.err);
            System.out.println("Caught it !");
        }
    }
}
