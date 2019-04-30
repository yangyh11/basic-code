package com.yangyh.day10.demo02;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-30 17:06
 *
 *如果实现类类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类。
 **/
public abstract class MyInterfaceImplB implements MyInterfaceA, MyInterfaceB {
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

    }

}
