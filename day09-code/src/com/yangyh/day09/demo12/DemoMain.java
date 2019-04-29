package com.yangyh.day09.demo12;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-29 14:43
 *
 * 抽象类不能创建对象，只能创建其非抽象子类的对象。
 **/
public class DemoMain {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.eat();
    }
}
