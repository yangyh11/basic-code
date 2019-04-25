package com.yangyh.day08.demo04;

import java.util.Arrays;

/**
 * @description: Arrays练习
 * @author: yangyh
 * @create: 2019-04-25 16:56
 *
 * 题目：
 * 请使用Arrays相关的api，将一个随机字符串中的所有字符升序排序，并倒序打印
 **/
public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "ikhjf45215DDgf";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        //倒叙打印
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
