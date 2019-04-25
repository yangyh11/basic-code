package com.yangyh.day08.demo04;

import java.util.Arrays;

/**
 * @description: 数组工具类
 * @author: yangyh
 * @create: 2019-04-25 16:34
 *
 * java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组常见的操作。
 *
 * public static String toString(数组)：将参数数组变成字符串(按照默认格式：[元素1, 元素2, 元素3...])
 * public static void sort(数组)：按照默认升序对数的元素进行排序。
 *
 * 注意：
 * 1.如果是数值，sort默认按照升序从小到大。
 * 2.如果是字符串，sort按照字母升序从小到大。
 * 3.如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。（今后学习）
 **/
public class Demo01Arrays {

    public static void main(String[] args) {
        int[] intArray = {1, 3, 4, 2, 5, 3, 34, 24};

        //将int[]数组按照默认格式变成字符串
        String str = Arrays.toString(intArray);
        System.out.println(str); //[1, 3, 4, 2, 5, 3, 34, 24]

        //int[]数组排序
        int[] array1 = {1, 4, 7, 4, 3, 5};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1)); //[1, 3, 4, 4, 5, 7]

        //String[]数组排序
        String[] array2 = {"aaa", "ddd", "ccc", "ggg"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); //[aaa, ccc, ddd, ggg]

    }
}
