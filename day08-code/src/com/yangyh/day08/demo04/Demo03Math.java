package com.yangyh.day08.demo04;

/**
 * @description: 数学工具类
 * @author: yangyh
 * @create: 2019-04-25 17:11
 *
 * java.lang.Math类是数学相关的工具类，里面改提供了大量的静态方法，完成与数学相关的操作。
 *
 *Math中常用的4(静态方法）+1(警惕常量)api：
 * public static abs(数字):绝对值,有多重重载
 * public static ceil(double num):向上取整
 * public static floor(double num):向下取整
 * public static round(double num):四舍五入
 *
 * Math.PI:代表近似的圆周率常量（double）
 **/
public class Demo03Math {

    public static void main(String[] args) {
        //取绝对值
        System.out.println(Math.abs(3.14)); //3.14
        System.out.println(Math.abs(-3.14)); //3.14
        System.out.println(Math.abs(0)); //0
        System.out.println(Math.abs(1)); //1

        System.out.println("===============");

        //向上取整
        System.out.println(Math.ceil(3.1)); //4.0
        System.out.println(Math.ceil(3.9)); //4.0
        System.out.println(Math.ceil(3.0)); //3.0

         System.out.println("===============");

        //向下取整
        System.out.println(Math.floor(3.1)); //3.0
        System.out.println(Math.floor(3.9)); //3.0
        System.out.println(Math.floor(3.0)); //3.0

        System.out.println("===============");

        //四舍五入
        System.out.println(Math.round(3.1)); //3
        System.out.println(Math.round(3.9)); //4
        System.out.println(Math.round(3.0)); //3

        //PI
        System.out.println(Math.PI); //3.141592653589793
    }
}
