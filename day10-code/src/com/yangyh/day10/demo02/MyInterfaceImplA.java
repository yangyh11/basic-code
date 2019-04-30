package com.yangyh.day10.demo02;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-30 17:06
 **/
public class MyInterfaceImplA implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");

    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中的冲突的默认方法进行了覆盖重写");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写的B方法");
    }
}
