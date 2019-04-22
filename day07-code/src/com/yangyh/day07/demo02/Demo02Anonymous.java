package com.yangyh.day07.demo02;

import java.util.Scanner;

/**
 * @description: 匿名对象作为参数和返回值
 * @author: yangyh
 * @create: 2019-04-21 21:49
 **/
public class Demo02Anonymous {

    public static void main(String[] args) {
        //普通的使用方式
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();

        //匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);

        //使用一般的方式使用来进行传参
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象的方式使用来进行传参
//        methodParam(new Scanner(System.in));


        Scanner sc = methodReturn();
        int i = sc.nextInt();
        System.out.println(i);

    }

    public static void methodParam(Scanner sc){

        int i = sc.nextInt();
        System.out.println("输入的是：" + i);

    }

    public static Scanner methodReturn(){

        return new Scanner(System.in);

    }
}
