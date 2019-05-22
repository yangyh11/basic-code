package com.yangyh.day12.demo05;

/**
 * @description: StringBuilder常用的成员方法
 * @author: yangyh
 * @create: 2019-05-23 06:46
 *
 * StringBuilder的常用方法：
 *      1.public StringBuilder append(...)  // 添加任意类型数据的字符串形式，并返回当前对象本身
 *      2.public String toString()  // 返回此序列中数据的字符串表示形式
 *
 * StringBuilder与String相互转换
 *
 * String --> StringBuilder:使用StringBuilder的带字符串构造方法
 *      StringBuilder sb = new StringBuilder(str);
 * StringBuilder --> String:使用StringBuilder的toString()方法
 *      String str = sb.toString();
 **/
public class Demo02StringBuilderMethod {

    public static void main(String[] args) {
        
        method01();
        System.out.println("=============== method02");
        method02();
    }

    /**
     * public StringBuilder append(...)
     */
    private static void method01() {
        StringBuilder sb = new StringBuilder();
        // 使用append方法往StringBuilder中添加数据
        // append返回的是this，调用方法的对象是sb，this == sb
        StringBuilder sb2 = sb.append("abc"); // 把sb的地址赋值给了sb2
        System.out.println(sb); // abc
        System.out.println(sb2); // abc
        System.out.println(sb == sb2); // true

        // 使用append方法无需接受返回值
        sb.append(1);
        sb.append(true);
        sb.append(8.8);
        sb.append('中');
        System.out.println(sb); // abc1true8.8中

        /*
            链式编程：方法返回值是一个对象，可以继续调用方法
         */
        System.out.println("abc".toUpperCase().substring(0,1));
        StringBuilder sb3 = new StringBuilder();
        sb3.append("abc").append(1).append(true).append(8.8).append('中');
        System.out.println(sb3); // abc1true8.8中
    }

    /**
     *  public String toString()
     */
    private static void method02() {

        // String --> StringBuilder
        String str = "hello";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("sb:" + sb);

        sb.append(" world").append("!!!");

        // StringBuilder -- > String
        String str2 = sb.toString();
        System.out.println("str2:" + str2);
    }
}
