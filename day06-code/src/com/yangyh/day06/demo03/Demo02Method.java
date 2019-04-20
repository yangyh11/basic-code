package com.yangyh.day06.demo03;

/**
 * @description: 面向对象的三大特性之一：封装性
 * @author: yangyh
 * @create: 2019-04-18 14:10
 *
 * 面向对象的三大特性：封装、继承、多态
 *
 * 封装性在Java两种的体现：
 * 1.方法就是一中封装。
 * 2.关键字private就是一种封装。
 *
 * 封装就是将一些细节信息隐藏起来，对外界不可见。
 **/
public class Demo02Method {


    public static void main(String[] args) {
        int[] array = {10, 20, 30, 35, 39, 200};

        int max = getMax(array);

        System.out.println("最大值：" + max);
    }

    public static int getMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
