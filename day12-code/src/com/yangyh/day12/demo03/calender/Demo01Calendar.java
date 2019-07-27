package com.yangyh.day12.demo03.calender;

import java.util.Calendar;

/**
 * @description: Calerdar类介绍_获取对象的方式
 * @author: yangyh
 * @create: 2019-05-20 22:19
 *
 * java.util.Calendar 日历类
 * Calendar类是一个抽象类，提供了很多操作日历字段的方法（YEAR、MONTH、DAY_OF_MONTH、HOUR）
 * Calendar类无法直接创建对象使用，该类有一个静态方法getInstance()，返回Calendar类的子类（GregorianCalendar）对象。
 * static Calendar getInstance()  使用默认时区和语言环境获得一个日历。
 **/
public class Demo01Calendar {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // 多态
        System.out.println(calendar);
    }
}
