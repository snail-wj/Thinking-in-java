package com.example.chapter13.section_13_3;

/**
 * @author wangjing
 * Created on 2019-03-27
 */
public class InfiniteRecursion {
    @Override
    public String toString() {
        return "address:" + this;
        //正确的调用
//        return "address:" + super.toString();
    }
}
