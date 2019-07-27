package com.yangyh.day12.demo03.calender;

import java.util.Calendar;
import java.util.Date;

/**
 * @description: Calendar类的常用成员方法
 * @author: yangyh
 * @create: 2019-05-20 22:36
 * <p>
 * Calendar类的常用成员方法：
 * 1.public int get(int field):返回给定日历字段的值。
 * 2.public void set(int field, int value):将给定的日历字段设置为给定的值。
 * 3.public abstract  void add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 * 4.public Date getTime():返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的Date对象。
 * <p>
 * 成员方法的参数：
 * int field：日历类的字段，可以使用Calendar类的静态成员变量获取。
 * 常用的如下：
 * public static final int YEAR = 1;   // 年
 * public static final int MONTH = 2;  // 月
 * public static final int DATE = 5;   // 一个月中的某天
 * public static final int DAY_OF_MONTH = 5 // 一个月中的某天
 * public static final int HOUR = 10;  // 时
 * public static final int MINUTE = 12;    // 分
 * public static final int SECOND = 13;    // 秒
 **/
public class Demo02CalendarMethod {

    public static void main(String[] args) {
        method4();
    }

    /**
     * public int get(int field):返回给定日历字段的值
     */
    private static void method1() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println("年：" + year); // 2019

        int month = calendar.get(Calendar.MARCH);
        System.out.println("月份：" + month); // 西方的月份0-11

        int day = calendar.get(Calendar.DATE);
        int day2 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("几号：" + day);
        System.out.println("几号：" + day2);
    }

    /**
     * public void set(int field, int value):将给定的日历字段设置为给定的值
     */
    private static void method2() {
        Calendar calendar = Calendar.getInstance();
        // 将给定的日历字段设置为给定的值
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, 13);
        calendar.set(Calendar.DATE, 13);
        System.out.println("新年：" + calendar.get(Calendar.YEAR)); // 2020
        System.out.println("月份：" + calendar.get(Calendar.MONTH)); // 1
        System.out.println("几号：" + calendar.get(Calendar.DATE)); // 13

        // 同时设置年月日,可以使用set的重载方法
        calendar.set(2020, 5, 20);
        int newYear = calendar.get(Calendar.YEAR);
        System.out.println("新年：" + newYear); // 2020
        System.out.println("月份：" + calendar.get(Calendar.MONTH)); // 5
        System.out.println("几号：" + calendar.get(Calendar.DATE)); // 20
    }

    /**
     * public abstract  void add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
     * 参数：
     *  int field:日历字段（）
     *  int amount：增加（正数）/减少（负数）的指定量
     */
    private static void method3() {
        Calendar calendar = Calendar.getInstance();
        // 增加两年
        calendar.add(Calendar.YEAR, 2);
        System.out.println("两年后是" + calendar.get(Calendar.YEAR));

        // 减少两个月
        calendar.add(Calendar.MONTH, -2);
        System.out.println("两个月前是" + calendar.get(Calendar.MONTH));

    }

    /**
     * public Date getTime():返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的Date对象
     * 把日历对象转换为日期对象
     */
    private static void method4() {
        Calendar calendar = Calendar.getInstance();
        // 增加两年
        calendar.add(Calendar.YEAR, 2);
        Date date = calendar.getTime();
        System.out.println("两年后的现在是：" + date);

    }


}
