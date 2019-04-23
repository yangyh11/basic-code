package com.yangyh.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @description: ArrayList存储随机数
 * @author: yangyh
 * @create: 2019-04-23 14:19
 *
 * 题目：
 * 生成6个1~33之间的随机数字，添加到集合，并遍历集合。
 *
 * 思路：
 * 1.不要存储6个数字，创建一个集合，<Integer>。
 * 2.产生随机数，使用Random类。
 * 3.循环6次，来产生6个随机数：for循环。
 * 4.循环内调用r.nextInt(int n),参数是33，生成的随机数是0~32，需要整体+1才是1~33。
 * 5.把数字添加到集合中：add。
 * 6.遍历集合：for
 **/
public class Demo01ArrayListRandom {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int n = r.nextInt(33) + 1;
            list.add(n);
        }
        System.out.println(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

}
