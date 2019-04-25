package com.yangyh.day08.demo02;

import java.util.Scanner;

/**
 * @description: 统计输入的字符串中各类字符串出现的次数
 * @author: yangyh
 * @create: 2019-04-24 17:38
 *
 * 题目：
 * 键盘输入一个字符串，并且统计各个字符串出现的次数。
 * 种类有：大写字母、小写字母、数字、其他
 **/
public class Demo07StringCount {

    public static void main(String[] args) {

        System.out.println("随机输入一串字符串：");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther =0;

        byte[] bytes = input.getBytes();

        char[] chars = input.toCharArray();

        //使用byte，通过ASCII判断
//        for (byte b : bytes) {
//            if (b >= 49 && b <= 57) {
//                countNumber++;
//            } else if (b >= 65 && b <= 90) {
//                countUpper++;
//            } else if (b >= 97 && b <= 122) {
//                countLower++;
//            } else {
//                countOther++;
//            }
//        }

        //通过char判断
        for (char ch : chars) {
            if (ch >= '0' && ch <= '9') {
                countNumber++;
            } else if (ch >= 'A' && ch <= 'Z') {
                countUpper++;
            } else if (ch >= 'a' && ch <= 'z') {
                countLower++;
            } else {
                countOther++;
            }
        }

        System.out.println("输入的字符串中数字出现的次数" + countNumber);
        System.out.println("输入的字符串中大写字母出现的次数" + countUpper);
        System.out.println("输入的字符串中小写字母出现的次数" + countLower);
        System.out.println("输入的字符串中其他字符出现的次数" + countOther);

    }

}
