package com.yangyh.day11.demo03.inner;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-08 13:35
 **/
public class Demo02InnerClass {

    public static void main(String[] args) {
        // 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称;
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}
