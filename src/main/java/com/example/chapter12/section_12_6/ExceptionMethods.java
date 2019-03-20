package com.example.chapter12.section_12_6;

/**
 * @author wangjing06
 * Created on 2019-03-20
 */
public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Caught it");
            System.out.println("getMessage(): " + e.getMessage());
            // getLocalizedMessage()就是加了本地化后的信息Message, 默认和getMessage是一样的
            System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.out.println("toString():" + e);
            System.out.println("printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
