package com.yangyh.day08.demo02.string;

/**
 * @description: 字符串的截取方法
 * @author: yangyh
 * @create: 2019-04-24 15:56
 *
 * public String substring(int index):截取从参数位置一直到字符串末尾，返回新的字符串。
 *
 * public String substring(int begin, int end):截取从beging开始，到end结束，中间的字符串。
 * 备注：[begin, eng),包含左边不包含右边。
 **/
public class Demo03Substring {

    public static void main(String[] args) {

        String str = "HelloWorld";
        String str2 = str.substring(5);
        System.out.println(str); //HelloWorld,原封不动
        System.out.println(str2); //World，新字符串

        String str3 = str.substring(5, 7);
        System.out.println(str3); //Wo

        //下面这种写法字符串的内容仍然没有改变
        //下面有两个字符串"Hello","World"
        //strA保存的是地址值，本来是"Hello"的地址值0x66，后来变成"World"的地址值0x99
        String strA = "Hello";
        System.out.println(strA); //Hello
        strA = "World";
        System.out.println(strA); //World

    }
}
