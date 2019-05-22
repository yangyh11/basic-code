package com.yangyh.day12.demo05;

/**
 * @description: StringBuilder的构造方法
 * @author: yangyh
 * @create: 2019-05-23 06:46
 *
 * java.lang.StringBuilder ：字符串缓冲区，可以提高字符串的效率。
 * 构造方法：
 *      1.public StringBuilder()    // 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符
 *      2.public StringBuilder(String str)  // 构造一个字符串生成器，并初始化为指定的字符串内容。该字符串生成器的初始容量为 16 加上字符串参数的长度
 **/
public class Demo01StringBuilder {

    public static void main(String[] args) {
        // 空参构造
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println("StringBuilder空参构造：" + stringBuilder1);

        // 带字符串的构造方法
        StringBuilder stringBuilder2 = new StringBuilder("Hello");
        System.out.println("带字符串的构造：" + stringBuilder2);
    }
}
