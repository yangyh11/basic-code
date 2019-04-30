package com.yangyh.day10.demo01;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-30 11:21
 **/
public class MyInterfaceDefaultImplB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {

        System.out.println("实现了抽象方法BBB");
    }

    @Override
    public void methodAbsDefault() {
        System.out.println("实现类B覆盖重写的默认方法");
    }
}
