package com.yangyh.day10.demo02;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-30 17:23
 **/
public interface MyInterface {

    public default void method() {
        System.out.println("接口的默认方法");
    }
}
