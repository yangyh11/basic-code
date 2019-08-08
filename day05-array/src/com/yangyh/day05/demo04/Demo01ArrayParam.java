package com.yangyh.day05.demo04;

/**
 * @description: 数组作为方法参数
 * @author: yangyh
 * @create: 2019-04-17 15:55
 *
 * 数组可以作为方法的参数。
 * 当调用方法的时候，向方法的小括号进行传参，传递进去的其实就是数组的地址值。
 **/
public class Demo01ArrayParam {


    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40};

        System.out.println(array); //地址值

        pringArray(array); //传递进去的就是数组的地址值
        System.out.println("--------AAA--------");
        pringArray(array);
        System.out.println("--------BBB--------");
        pringArray(array);
        System.out.println("--------CCC--------");

    }

    /*方法的三要素
    * 修饰符
    * 返回值类型
    * 参数列表
    * */
    public static void pringArray(int[] array) {

        System.out.println(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

}
