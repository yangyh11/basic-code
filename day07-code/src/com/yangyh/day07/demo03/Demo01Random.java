package com.yangyh.day07.demo03;

import java.util.Random;

/**
 * @description: Random类的概述与基本使用
 * @author: yangyh
 * @create: 2019-04-21 22:43
 *
 * Random类用来生成随机数字。使用起来也是三个步骤：
 * 1.导包
 * import java.util.Randpm
 *
 * 2.创建对象
 * Random r = new Random();
 *
 * 3.使用
 * 获取一个随机的int数字（数字范围是int范围，有正负两种）：int i = r.nextInt();
 * 获取一个随机的int数字（参数代表了范围，左闭右开）：int i = r.nextInt();
 * 实际上代表的含义是：[0,3),也就是0，1，2
 **/
public class Demo01Random {


    public static void main(String[] args) {
        Random r = new Random();

        int i = r.nextInt();
        System.out.println("生成的随机数字是：" + i);
    }

}
