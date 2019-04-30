package com.yangyh.day10.demo03;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-30 17:27
 **/
public interface MyInterfaceB {

    public abstract void methodB();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("接口B的默认方法");
    }
}
