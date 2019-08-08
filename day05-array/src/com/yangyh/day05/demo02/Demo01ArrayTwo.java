package com.yangyh.day05.demo02;

/**
 * @description: 两个数组的内存图
 * @author: yangyh
 * @create: 2019-04-16 21:23
 **/
public class Demo01ArrayTwo {

    public static void main(String[] args) {
        //动态初始化一个数组
        int[] array = new int[3];

        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("------------");

        //
        array[1] = 20;
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //动态初始化一个数组
//        int[] arrayB = new int[3];
        int[] arrayB = array;

        System.out.println(arrayB);
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("------------");

        //
        arrayB[1] = 10;
        arrayB[2] = 100;
        System.out.println(arrayB);
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("------------");

        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
