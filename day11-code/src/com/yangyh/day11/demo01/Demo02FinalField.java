package com.yangyh.day11.demo01;

/**
 * @description: final关键字用于修饰局部变量
 * @author: yangyh
 * @create: 2019-05-07 17:27
 *
 * 当final关键字用来修饰一个局部变量的时候，格式：
 * 基本数据类型：
 * final 变量类型 变量名称 = 数据值;
 * 引用数据类型：
 * final 变量类型 变量名称 = new 变量类型();
 *
 * 一旦使用final修饰局部变量，那么这个变量就不能进行修改
 * “一次赋值，终生不变”
 **/
public class Demo02FinalField {

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1); // 10
        num1 = 20;
        System.out.println(num1); // 20

        // 一旦使用final修饰局部变量，那么这个变量就不能进行修改
        // “一次赋值，终生不变”
        final int num2 = 200;
        System.out.println(num2);

//        num2 = 250; // 错误写法！不能改变
//        num2 = 200; // 错误写法

        // 正确写法，只要保证有唯一一次赋值即可
        final int num3;
        num3 = 300;

        // 对于基本数据类型来说，不可变说的是变量当中的数据不可改变
        // 对于引用类型来说，不可变说的是变量当中的地址值不可变
        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("霍建华");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        final Student stu2 = new Student("高圆圆");
        System.out.println(stu2);
        // 错误写法!final的引用类型变量，其中的地址不可改变
//        stu2 = new Student("赵又廷");
        System.out.println(stu2.getName());
        // final的引用类型变量的内容是可以改变的
        stu2.setName("赵又廷");
        System.out.println(stu2.getName());



    }
}
