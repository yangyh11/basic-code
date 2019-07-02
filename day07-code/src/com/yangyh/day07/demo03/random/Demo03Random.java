package com.yangyh.day07.demo03.random;

import java.util.Random;

/**
 * @description: 生成1-n之间的数字
 * @author: yangyh
 * @create: 2019-04-21 23:16
 *
 * 题目要求：
 * 根据int变量n的值，来获取随机数字，范围是[1,n],可以取到1，也可以取到n。
 *
 * 思路：
 * 1.定义一个int变量n，随意赋值。
 * 2.要使用Random：三个步骤，导包、创建对象、使用。
 * 3.如果写10，那么就是0~9，然而那些想要的是1~10，可以发现：整体+1即可。
 * 4.可以打印随机数字。
 **/
public class Demo03Random {

    public static void main(String[] args) {
        int n = 5;

        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            // 本来范围是[0,n),整体加一后变成[1,n+1),也就是[1,n]
            int num = r.nextInt(n) + 1;
            System.out.println(num);

        }
    }
}
