package com.yangyh.day10.demo01;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-30 11:02
 *
 * 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类。
 **/
public abstract class MyInterfaceAbstractImplB implements MyInterfaceAbstract {
    @Override
    public void methodAbs1() {
        System.out.println("这是第一个方法！");

    }

    @Override
    public void methodAbs2() {
        System.out.println("这是第二个方法！");

    }

    @Override
    public void methodAbs3() {
        System.out.println("这是第三个方法！");

    }

}
