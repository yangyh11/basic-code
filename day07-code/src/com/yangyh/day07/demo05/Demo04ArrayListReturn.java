package com.yangyh.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @description: 筛选集合中的随机数
 * @author: yangyh
 * @create: 2019-04-23 16:02
 * <p>
 * 题目：
 * 用一个大集合存入20个1~100的随机数，然后筛选集合当中的偶数，放到小集合当中。
 * 要求用自定义的的方法来进行筛选。
 *
 * 分析：
 * 1.需要创建一个大集合，用来存储int数字。<Integer>
 * 2.随机数字就用Random类的nextInt()方法。
 * 3.循环20次，把随机数字放入大集合中。
 * 4.定义一个方法用来进行筛选。
 *  方法三要素：
 *      4.1返回值类型：ArrayList小集合
 *      4.2方法名称：getEvenNumberList
 *      4.3方法参数：ArrayList大集合
 * 5.判断（if）是偶数：num % 2 == 0
 * 6.如果是偶数就放入小集合中。
 **/
public class Demo04ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100) + 1);
        }
        System.out.println(list);

        System.out.println(getEvenNumberList(list));
    }

    public static ArrayList<Integer> getEvenNumberList(ArrayList<Integer> list) {

        ArrayList<Integer> evenNumberList = new ArrayList<>();
        for (Integer integer : list) {
            // % 取余；/ 商的整数
            if (integer % 2 == 0) {
                evenNumberList.add(integer);
            }
        }
        return evenNumberList;

    }


}
