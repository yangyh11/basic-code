package com.yangyh.day09.demo13;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-29 16:14
 *
 * 非抽象子类必须重写抽象父类中的所有抽象方法
 **/
public class Dog2Ha extends Dog {
    @Override
    public void sleep() {
        System.out.println("嘿嘿嘿...");
    }
}
