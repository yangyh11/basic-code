package com.yangyh.day06.demo03;

/**
 * @description: 成员变量与局部变量的区别
 * @author: yangyh
 * @create: 2019-04-18 13:47
 *
 * 局部变量与成员变量
 * 1.定义的位置不一样【重点】
 * 局部变量：方法的内部。
 * 成员变量：在方法的外部，直接写在类里面。
 *
 * 2.作用范围不一样【重点】
 * 局部变量：只有在方法当中才可以使用，出了方法就不能再用。
 * 成员变量：整个类都可以用。
 *
 * 3.默认值不一样【重点】
 * 局部变量：没有默认值，必须要赋值后才可以使用。
 * 成员变量：如果没有赋值，会有默认值，规则和数组一样。
 *
 * 4.内存的位置不一样（了解）
 * 局部变量：位于栈内存。
 * 成员变量：位于堆内存。
 *
 * 5.生命周期不一样（了解）
 * 局部变量：随着方法进栈而诞生，随着方法出栈而消失。
 * 成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失。
 **/
public class Demo01VariableDifference {

    String name; //成员变量

    public void methodA(){
        int age = 20; //局部变量

        System.out.println(name);
        System.out.println(age);
    }

    public void methodB(String param){ //方法的参数就是局部变量

        //在方法被调用的时候，参数必然会被赋值
        System.out.println(param);

        int age;
//        System.out.println(age); //局部变量没赋值不能用

        System.out.println(name);
    }
}
