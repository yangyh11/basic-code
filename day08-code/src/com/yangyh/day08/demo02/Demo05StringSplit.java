package com.yangyh.day08.demo02;

/**
 * @description: 字符串的分割方法
 * @author: yangyh
 * @create: 2019-04-24 16:43
 *
 * 分割字符串的方法：
 * public String[] split(Stirng regex):按照参数的规则，将字符串切分切分成为若干部分。
 *
 * 注意事项：
 * split方法的的参数其实是一个“正则表达式”，今后学习。
 * 今天要注意的是，如果按照英文据点“.”进行切分，必须写"\\."
 * 正则表达式特殊字符要进行转义。
 **/
public class Demo05StringSplit {

    public static void main(String[] args) {

        String str1 = "aaa,bbb,ccc";
        String[] strings = str1.split(",");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println("====================");

        String str2 = "aaa bbb ccc";
        String[] strings1 = str2.split(" ");
        for (String s : strings1) {
            System.out.println(s);
        }

        System.out.println("====================");

        String str3 = "aaa.bbb.ccc";
        String[] strings3 = str3.split(".");
        System.out.println(strings3.length); //0
        for (String s : strings3) {
            System.out.println(s);
        }

        System.out.println("====================");

        String str4 = "aaa.bbb.ccc";
        String[] strings4 = str3.split("\\.");
        System.out.println(strings4.length); //3
        for (String s : strings4) {
            System.out.println(s);
        }
    }
}
