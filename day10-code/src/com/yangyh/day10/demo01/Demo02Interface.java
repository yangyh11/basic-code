package com.yangyh.day10.demo01;

/**
 * @description: 接口的默认方法使用
 * @author: yangyh
 * @create: 2019-04-30 11:27
 *
 * 1.接口的默认方法，可以通过接口实现类对象，直接调用。
 * 2.接口的默认方法，也可以被接口实现类进行覆盖重写。
 **/
public class Demo02Interface {

    public static void main(String[] args) {
        // 创建实现类对象
        MyInterfaceDefaultImplA a = new MyInterfaceDefaultImplA();
        a.methodAbs(); // 调用抽象方法，实际运行的是右侧的实现类。

        //调用默认方法，如果实现当中没有，会向上找
        a.methodAbsDefault();

        System.out.println("------------------------");

        MyInterfaceDefaultImplB b = new MyInterfaceDefaultImplB();
        b.methodAbs();
        b.methodAbsDefault();

    }

}
