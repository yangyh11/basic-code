package com.yangyh.day08.demo04;

/**
 * @description: Math练习
 * @author: yangyh
 * @create: 2019-04-25 17:26
 *
 * 题目：
 * 计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
 *
 * 分析：
 * 1.既然已经确定了范围，for循环。
 * 2.起点位置-10.8应该转换为-10，两种方法:
 *  2.1可以使用Math.ceil方法，向上取整。
 *  2.2强转为int，自动舍弃所有小数。
 * 3.每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的。
 * 4.如何拿到绝对值：Math.abs方法。
 * 5.一旦发现一个数字，需要让计数器++进行统计。
 *
 * 备注：如果使用Math.ceil方法，-10.8可以变成-10.0。注意double也是可以进行++的。
 **/
public class Demo04MathPractise {

    public static void main(String[] args) {

        double min = -10.8;
        double max = 5.9;

        int count = 0;

        //变量i就是区间的所有整数
        for (int i = (int)min; i < max; i++) {
            int temp = Math.abs(i);
            if (temp > 6 || temp < 2.1) {
                count++;
            }
        }

        System.out.println("满足条件的整数有" + count + "个");

    }
}
