package com.yangyh.day12.demo02;

import java.util.Date;

/**
 * @description: Date类的构造方法和常用的成员方法
 * @author: yangyh
 * @create: 2019-05-14 23:40
 **/
public class Demo02DateMethod {

    public static void main(String[] args) {

        method1();
        method2();
        method3();
    }

    /**
     * Date类的空参构造方法：
     * public Date(); // 获取当前系统的日期和时间
     */
    private static void method1() {
        Date date = new Date();
        System.out.println(date); // Tue May 14 23:44:58 CST 2019
    }

    /**
     * Date类的带参构造方法：
     * public Date(long date); // 传递毫秒值，把毫秒值转换为Date日期
     */
    private static void method2() {
        Date date = new Date(0L);
        System.out.println(date); // Thu Jan 01 08:00:00 CST 1970
    }

    /**
     * Date类常用的成员方法：
     * public long getTime(); // 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数
     */
    private static void method3() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
