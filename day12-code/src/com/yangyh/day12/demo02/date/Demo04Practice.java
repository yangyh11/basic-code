package com.yangyh.day12.demo02.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @description: 计算一个人已经出生了多少天
 * @author: yangyh
 * @create: 2019-05-19 23:45
 *
 * 练习：请使用日期时间相关API，计算出一个人已经出生了多少天。
 * 分析：
 *  1.使用Scanner类的next方法，获取出生日期。
 *  2.使用DateFormat类中的parse方法，把字符串的出生日期解析为Date格式的出生日期。
 *  3.把Date格式的出生日期转换为毫秒值。
 *  4.获取当前的日期，转换为毫秒值。
 *  5.使用当前日期的毫秒值 - 出生日期的毫秒值
 *  6.把毫秒值转换为天。
 **/
public class Demo04Practice {

    public static void main(String[] args) {
        // 1.获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期，格式为 xxxx-xx-xx（如：1994-09-09）");
        String birthdayStr = sc.next();

        // 2.解析出生日期
        Date birthDay = null;
        try {
            birthDay = parse(birthdayStr);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("输入出生日期格式不正确");
        }

        // 3.出生日期转换为毫秒
        Long birthDayTimes = birthDay.getTime();

        // 4.获取当前时间的毫秒值
        Long now = System.currentTimeMillis();

        // 5.使用当前日期的毫秒值 - 出生日期的毫秒值
        Long diff = now - birthDayTimes;

        // 6.计算时多少天
        Long day =diff / (24*60*60*1000);
        System.out.println(day);

    }


    private static Date parse(String dateStr) throws ParseException {
        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateStr);
        return date;
    }
}
