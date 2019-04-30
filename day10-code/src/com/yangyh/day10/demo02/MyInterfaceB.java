package com.yangyh.day10.demo02;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-30 17:00
 **/
public interface MyInterfaceB {

    // 错误写法！接口不能有静态代码块
//    static {
//
//    }

    // 错误写法！接口不能有构造方法
//    public MyInterfaceA() {
//
//    }

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("接口B的默认方法");
    }

}
