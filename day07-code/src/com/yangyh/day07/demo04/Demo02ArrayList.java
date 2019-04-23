package com.yangyh.day07.demo04;

import java.util.ArrayList;

/**
 * @description: ArrayList集合的概述与基本使用
 * @author: yangyh
 * @create: 2019-04-23 10:12
 *
 * 数组的长度不能发生改变。
 * 但是ArrayList集合的长度是可以随意变化的。
 *
 * 对于ArrayList来说，有一个尖括号<E>代表泛型。
 * 泛型：也就是装在集合当中的元素，全都是统一的什么类型。
 * 注意：泛型只能是引用类型，不能是基本类型。
 *
 * 注意事项：
 * 对于ArrayList来说，直接打印得到的不是地址值，而是内容。
 * 如果内容是空，打印得到的是空的中括号:[]
 **/
public class Demo02ArrayList {

    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据。
        //备注：从jdk1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的。
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list); //[]

        //像集合中添加一些数据，使用add方法
        list.add("小米");
        System.out.println(list); //[小米]

        list.add("苹果");
        list.add("华为");
        list.add("三星");
        System.out.println(list); //[小米, 苹果, 华为, 三星]

//        list.add(12); //错误写法！因为创建的时候尖括号泛型已经说了是字符串，添加进去的元素就必须都是字符串才行。
    }
}
