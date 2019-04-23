package com.yangyh.day07.demo04;

import java.util.ArrayList;

/**
 * @description: ArrayList集合存储基本数据类型
 * @author: yangyh
 * @create: 2019-04-23 14:02
 *
 * 如果希望向ArrayList集合当中存储基本数据类型，必须使用基本数据类型的“包装类”。
 * 基本类型     包装类（引用类型，包装类都位于java.lang包下）
 * byte        Byte
 * short       Short
 * int         Integer  【特殊】
 * long        Long
 * float       Float
 * double      Double
 * char        Character 【特殊】
 * boolean     Boolean
 * 从jdk1.5开始，支持自动装箱，自动拆箱
 * 自动装箱：基本类型 --> 包装类型
 * 自动拆箱：包装类型 --> 基本类型
 **/
public class Demo05ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //错误写法！泛型只能是引用类型，不能是基本数据类型
//        ArrayList<int> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(12);
        listB.add(115);
        System.out.println(listB); //[12, 115]

        int num = listB.get(1);
        System.out.println("第1号元素是：" + num); //115
    }
}
