package com.yangyh.day09.demo08;

/**
 * @description: super关键字的使用
 * @author: yangyh
 * @create: 2019-04-26 17:32
 *
 * super关键字的用法有三种：
 * 1.在子类的成员方法中，访问父类的成员变量。
 * 2.在子类的成员方法中，调用父类的成员方法。
 * 3.在子类的构造方法中，调用父类的构造方法。
 **/
public class Demo01Super {

    public static void main(String[] args) {

        Zi zi = new Zi();
        zi.method();

    }
}
