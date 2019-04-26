package com.yangyh.day09.demo01;

/**
 * @description: 继承的格式
 * @author: yangyh
 * @create: 2019-04-26 10:55
 *
 * 在继承关系中，“子类就是一个父类”。也就是说，子类可以被当做父类看待。
 * 例如父类是员工，子类是讲，那么“讲师就是一个员工”。关系：is-a.
 *
 * 定义父类的格式：(一个普通类的定义)
 * pubic class 父类名称 ｛
 *     //...
 * ｝
 *
 * 定义子类的格式：
 * public class 子类名称 extends 父类名称 {
 *     //...
 * }
 *
 **/
public class Demo01Extends {

    public static void main(String[] args) {
        //创建一个子类对象
        Teacher teacher = new Teacher();
        //Teacher类当中虽然什么都没有写，但是会继承来自父类的method方法。
        teacher.method();

        //创建另一个子类助教的对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
