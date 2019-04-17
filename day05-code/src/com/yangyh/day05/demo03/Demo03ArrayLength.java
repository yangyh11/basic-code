package com.yangyh.day05.demo03;

/**
 * @description: 数组长度的获取
 * @author: yangyh
 * @create: 2019-04-17 13:59
 *
 * 获取数组的长度格式
 * 数组名称.length
 * 将会得到一个int数字，代表数组的长度
 *
 * 数组一旦创建，运行期间，长度不可变
 **/
public class Demo03ArrayLength {

    public static void main(String[] args) {

        int[] arrayA = new int[3];

        int[] arrayB = {3, 4, 41, 225, 0, 3, 5, 0, 2, 7, 5};

        int len = arrayB.length;
        System.out.println("数组arrayB的长度：" + len);
        System.out.println("----------------------");

        int[] arrayC = new int[3];

        System.out.println(arrayC.length); //3
        arrayC = new int[5];
        System.out.println(arrayC.length); //5

    }
}
