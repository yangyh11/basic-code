package com.yangyh.day10.demo03;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-30 17:27
 * 这个接口当中有几个方法？ 答：5个
 * methodA 来源于接口A
 * methodB 来源于接口B
 * methodCommon 同时来源于接口A，接口B
 * method 来源于我自己
 * methodDefault 覆盖重写来源于我自己
 **/
public interface MyInterface extends MyInterfaceA, MyInterfaceB{

    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("子接口覆盖重写的默认方法");
    }
}
