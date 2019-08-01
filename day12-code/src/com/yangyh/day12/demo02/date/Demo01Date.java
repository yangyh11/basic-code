package com.yangyh.day12.demo02.date;

/**
 * @description: 毫秒值的概念与作用
 * @author: yangyh
 * @create: 2019-05-13 23:32
 * java.util.Date：表示日期和时间的类
 * 类Date表示特定的的瞬间，精确到毫秒。
 * 毫秒：千分之一秒，1秒 = 1000毫秒
 * 特定的瞬间：一个时间点，一刹那间
 * 2019-05-13 23:56:33:334 瞬间
 * 2019-05-13 23:56:33:335 瞬间
 * ...
 * 毫秒值的作用：可以对时间和日期进行计算
 * 2015-12-01 到 2019-05-13中间一共有多少天
 * 可以把日期转换为毫秒，计算完毕，再把毫秒转换为天数。
 *
 * 把日期转换为毫秒：
 * 当前日期：2019-05-13
 * 时间原点（0毫秒）：1970年1月1日00:00:00:000
 * 就计算当前日期到时间原点之间一共经历了多少毫秒(1557762676256L)
 *
 * 【注意】：中国属于东八区，会把时间增加8个小时
 *          1970年1月1日08:00:00:000
 *
 * 把毫秒转换为天数：
 * 1天=24 * 60 * 60 = 86400秒 = 86400 * 1000 = 86400000 毫秒
 **/
public class Demo01Date {

    public static void main(String[] args) {
        // 获取当前系统时间到时间原点经历了多少秒
        System.out.println(System.currentTimeMillis());
    }
}