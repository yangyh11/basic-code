package com.yangyh.day08.demo02.string;

/**
 * @description: 字符串获取的相关方法
 * @author: yangyh
 * @create: 2019-04-24 15:32
 *
 * String当中与获取相关的常用方法有：
 * 1.public int length()                 // 获取字符串当中含有的字符个数，拿到字符串长度。
 * 2.public String concat(String str)    // 将当前字符串与参数字符串拼接成为新的字符串作为返回值。
 * 3.public char charAt(int index)       // 获取指定索引位置的单个字符。（索引从0开始）
 * 4.public int indexOf(String str)      // 查找参数字符串在本字符串当中首次出现的索引位置，如果没有就返回-1。
 **/
public class Demo02StringGet {

    public static void main(String[] args) {
        //获取字符串的长度
        String str = "weddffdsdddfdd";
        int length = str.length();
        System.out.println("字符串的长度为:" + length);

        //拼接字符创
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println("拼接后的字符串为：" + str3);
        System.out.println(str1);
        System.out.println(str2);

        //获取指定索引位置的字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);

        //查找参数字符串在原字符串当中第一次出现的索引位置
        //如果没有，就返回-1
        String original = "AAHelloWorldHelloWorld";
        int index = original.indexOf("Hello");
        System.out.println("Hello在字符串中首次出现的索引位置为：" + index);

        System.out.println(original.indexOf("bb")); //-1
    }
}
