package com.yangyh.day09.demo02;

/**
 * @description: 继承中成员变量的访问特点
 * @author: yangyh
 * @create: 2019-04-26 14:15
 *
 * 在父子类继承关系当中，如果成员变量重名，则创建子类对象后，访问成员变量有两种方式
 *
 * 直接通过子类对象访问成员变量：
 *      等号左边是谁，就优先用谁，没有则向上找。
 * 间接通过成员方法访问成员变量：
 *      该方法属于谁（定义在哪），就优先用谁，没有就向上找。
 **/
public class Demo01ExtendsField {

    public static void main(String[] args) {
        // 创建父类对象
        Fu fu = new Fu();
        System.out.println(fu.numFu); // 只能使用父类的东西，没有任何子类的东西。
        System.out.println("=========================");

        Zi zi = new Zi();
        System.out.println(zi.numFu); //10
        System.out.println(zi.numZi); //20
        System.out.println("=========================");

        //等号左边是谁，就优先用谁
        System.out.println(zi.num); //优先子类，200
//        System.out.println(zi.abc); //到处都没有，编译报错！
        System.out.println("=========================");

        //这个方法是子类，优先用子类的，没有就向上找
        zi.methodZi(); //200
        //这个方法是父类当中定义的
        zi.methodFu(); //100

    }
}
