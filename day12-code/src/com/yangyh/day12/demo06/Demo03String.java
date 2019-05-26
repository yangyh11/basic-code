package com.yangyh.day12.demo06;

/**
 * @description: 包装类_基本类型与字符串类型之间的转换
 * @author: yangyh
 * @create: 2019-05-26 23:09
 *
 * 基本类型与字符串类型之间的相互转换：
 * 基本类型 -> 字符串（String）
 *      1.基本数据类型 + ""   最简单的方法（工作中常用）
 *      2.包装类的静态方法：toString(参数)，不是Object类的toString重载
 *          public static String toString(int i) // 返回int参数的字符串表示形式。
 *      3.String类的静态方法：valueOf(参数)
 *          public static String valueOf(int i) // 返回int参数的字符串表示形式
 * 字符串（String） -> 基本类型
 *      1.包装类的静态方法：parseXXX(String s)
 *      Integer类：public static int parseInt(String s) throws NumberFormatException
 *      Double类：public static double parseDouble(String s) throws NumberFormatException
 *      2.包装类的静态方法：valueOf(String s)
 *      Integer类：public static Integer valueOf(String s) throws NumberFormatException
 *      Double类：public static Double valueOf(String s) throws NumberFormatException
 */
public class Demo03String {
    public static void main(String[] args) {
        // 基本类型 -> 字符串（String）
        int i1 = 100;
        String str1 = i1 + "";
        System.out.println("Str1:" + str1);

        String str2 = Integer.toString(i1);
        System.out.println("str2:" + str2);

        String str3 = String.valueOf(i1);
        System.out.println("str3:" + str3);

        // 字符串（String） -> 基本类型
        String str4 = "200";
        int i2 = Integer.parseInt(str4);
        System.out.println("i3:" + i2);

        int i3 = Integer.valueOf(str4);
        System.out.println("i2:" + i3);

    }
}
