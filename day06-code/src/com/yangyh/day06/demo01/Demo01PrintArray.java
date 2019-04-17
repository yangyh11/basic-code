package com.yangyh.day06.demo01;

import java.util.Arrays;

/**
 * @description: 面向对象思想概述
 * @author: yangyh
 * @create: 2019-04-17 16:53
 *
 * 面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理每一个情节。
 * 面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮我做事。
 **/
public class Demo01PrintArray {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 45, 50};

        //要求打印格式为：[10, 20, 30, 40, 45, 50]
        //面向过程，每一步都要亲力亲为
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) { //如果是最后一个元素
                System.out.print(array[i] + "]");
            } else { //如果不是最后一个元素
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();


        //面向对象
        //找一个JDK给我们提供的Arrays类
        //其中有一个toString()方法，直接把数组变成字符创
//        System.out.println(array.toString()); //错误写法
        System.out.println(Arrays.toString(array));
    }
}
