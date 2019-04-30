package com.yangyh.day10.demo01;

/**
 * @description: 接口的默认方法使用
 * @author: yangyh
 * @create: 2019-04-30 11:27
 *
 * 注意事项：不能通过接口实现类的对象来调用接口当中的静态方法。
 * 正确用法：通过接口名称，直接调用接口的静态方法。
 *格式：
 * 接口名称.静态方法名()
 **/
public class Demo03Interface {

    public static void main(String[] args) {
        // 创建实现类对象
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        // 错误写法
//        impl.methodStatic();

        // 通过接口名称，直接调用接口的静态方法
        MyInterfaceStatic.methodStatic();

    }

}
