package com.yangyh.day08.demo03.statickeyword;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-25 15:26
 **/
public class MyClass {

    int num; //成员变量
    static int numStatic; //静态变量

    public void method() {
        System.out.println("这是一个成员方法。");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);
    }

    public static void methodStatic() {
        System.out.println("这是一个静态方法。");
        //静态不能直接访问非静态【重点】
//        System.out.println(num); //错误写法
        //静态可以访问静态
        System.out.println(numStatic);

//        System.out.println(this); //错误写法
    }
}
