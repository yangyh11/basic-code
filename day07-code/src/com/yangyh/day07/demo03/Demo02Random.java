package com.yangyh.day07.demo03;

import java.util.Random;

/**
 * @description: 生成指定范围的内的随机数字
 * @author: yangyh
 * @create: 2019-04-21 22:50
 *
 *
 **/
public class Demo02Random {

    public static void main(String[] args) {

        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(r.nextInt(10)); //生成0~9的随机数
        }
    }
}
