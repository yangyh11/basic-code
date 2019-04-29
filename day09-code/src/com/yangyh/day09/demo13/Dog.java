package com.yangyh.day09.demo13;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-29 16:12
 *
 * 非抽象子类必须重写抽象父类中的所有抽象方法
 **/
public abstract class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }
}
