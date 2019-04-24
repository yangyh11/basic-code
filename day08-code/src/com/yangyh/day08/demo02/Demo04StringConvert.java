package com.yangyh.day08.demo02;

/**
 * @description: 字符串转换的相关方法
 * @author: yangyh
 * @create: 2019-04-24 16:17
 *
 * String当中与转换相关的常用方法有：
 * public char[] toCharArray():将当前字符串拆分成字符数组返回。
 * public byte[] getBytes():获得当前字符串底层的字节数组。
 * public String replace(CharSequence target, CharSequence replacement):将所有出现的老字符串替换成为新的字符串，
 *  返回替换之后的结果新字符串。
 * 备注：CharSequence意思是说可以接受字符串类型。String类实现了CharSequence接口
 **/
public class Demo04StringConvert {

    public static void main(String[] args) {
        //转换为字符数组
        String str = "Hello";
        char[] charArray = str.toCharArray();
        System.out.println(charArray[2]);
        System.out.println(charArray.length);

        System.out.println("==================");

        //获取字符串的底层字节数组
        String str2 = "Hello";
        byte[] byteArray = str2.getBytes();
        System.out.println(byteArray[2]);
        System.out.println(byteArray.length);

        System.out.println("==================");

        //字符串替换
        String str3 = "卧槽，你会不会玩?";
        String str4 = str3.replace("卧槽", "**");
        System.out.println(str4);
    }
}
