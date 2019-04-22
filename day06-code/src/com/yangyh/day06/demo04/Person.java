package com.yangyh.day06.demo04;

/**
 * @description: this关键字
 * @author: yangyh
 * @create: 2019-04-20 10:40
 *
 * 当方法的局部变量与成员变量重名时，根据“就近原则”，优先使用局部变量。
 * 当需要访问本类当中的而成员变量，需要使用格式：
 * this.成员变量名称
 *
 * “通过谁调用的方法，谁就是this”
 **/
public class Person {

    String name;

    public void sayHello(String name) {
        System.out.println(name + "你好，我是" + this.name);
        System.out.println(this);
    }
}
