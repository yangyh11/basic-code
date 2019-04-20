package com.yangyh.day06.demo01;

/**
 * @description: 对象的创建以及使用
 * @author: yangyh
 * @create: 2019-04-17 19:25
 *
 * 通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。
 *
 * 1.导包：也就是指出需要使用的类，在什么位置。
 * import 包名称.类名称;
 *
 * import com.yangyh.day06.demo01.Demo02Student
 * 对于和当前类属于同一个包的情况下，可以省略导包语句不写。
 *
 * 2.创建，格式：
 * 类名称 对象名 = new 类名称();
 * Student stu = new Stident();
 *
 * 3.使用，分两种情况
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法(参数);
 * 想用谁，就对象名点谁。
 *
 * 注意事项：如果成员变量没有赋值，那么将会有一个默认值，规则和数组一样。
 *
 **/
public class Demo02Student {

    public static void main(String[] args) {
        //1.导包。
        //我需要使用的Student类，和我自己Demo02Student位于听一个包下，所以省略导包语句不写

        //2.创建
        //类名称 对象名 = new 类名称();
        Student stu = new Student();

        //3.使用成员变量
        System.out.println(stu.name); //null
        System.out.println(stu.age); //0
        System.out.println("---------------");

        //改变对象中成员变量的值
        stu.name = "张三";
        stu.age = 20;
        System.out.println(stu.name); //张三
        System.out.println(stu.age); //20
        System.out.println("---------------");

        //4.使用对象的成员方法
        stu.eat();
        stu.sleep();

    }

}
