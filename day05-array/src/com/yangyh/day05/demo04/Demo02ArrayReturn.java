package com.yangyh.day05.demo04;

/**
 * @description: 数组作为方法返回值类型
 * @author: yangyh
 * @create: 2019-04-17 16:04
 *
 * 一个方法可以有0、1、多个参数；但是只能有0或者1个返回值，不能有多个返回值。
 * 如果希望一个方法当中产生多个数据结果进行返回怎么办？
 * 解决方案：使用一个数组作为方法返回值类型
 *
 * 任何数据类型都可以作为方法的参数类型，或者返回值类型。
 *
 * 数组作为方法的参数，传递进去的就是数组的地址值。
 * 数组作为方法的返回值，返回的就是数组的地址值。
 **/
public class Demo02ArrayReturn {

    public static void main(String[] args) {

        int[] result = calculate(10, 20, 30);

        System.out.println("main方法接收到的返回值数组是:" + result);

        System.out.println("总和：" + result[0]);
        System.out.println("平均值：" + result[1]);

    }

    public static int[] calculate(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum /3;

        int [] result = {sum, avg};

        System.out.println("calculate方法内部的数组是:" + result);

        return result;
    }


}
