package com.yangyh.day07.demo01;

import java.util.Scanner; //1.导包

/**
 * @description: Scanner概述
 * @author: yangyh
 * @create: 2019-04-20 16:30
 *
 * Scanner类的功能：可以实现键盘输入数据，到程序当中。
 *
 * 引用类型的一般使用步骤：
 * 1.导包
 *import 包路径.类名称
 * 如果需要使用的目标类，和当前类位于同一包下，则可以省略导包语句不写。
 * 只有java.lang包下面的类不需要导包，其他的类都需要导包import。
 *
 * 2.创建
 * 类名称 对象名 = new 类名称();
 *
 * 3.使用
 * 对象名.成员方法名();
 * 对象名.成员变量;
 *
 *获取键盘输入的一个int数字：int num = sc.nextInt();
 *获取键盘输入的一个字符串：String str = sc.next();
 **/
public class Demo01Scanner {

    public static void main(String[] args) {

        //2.创建
        Scanner sc = new Scanner(System.in);

        //3.使用
        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);

        String str = sc.next();
        System.out.println("输入的字符串是：" + str);



    }
}
