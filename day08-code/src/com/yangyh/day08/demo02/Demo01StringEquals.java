package com.yangyh.day08.demo02;

/**
 * @description: 字符串比较的相关方法
 * @author: yangyh
 * @create: 2019-04-24 14:30
 *
 * ==是进行地址值比较，如果确实需要字符串的内容比较，可以使用String类的两个方法。
 *
 * public boolean equals(Object anObject):参数可以是任何对象，只有参数是一个字符串，并且内容相等时才会返回true：否则返回false。
 * 注意事项：
 * 1.任何对象都可以用Object接收。
 * 2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)的结果相同。
 * 如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
 * 推荐:"abc".equals(str)     不推荐：str.equals("abc")
 *
 * public boolean equalsIgnoreCase(String anotherString):忽略大小写，进行比较。
 **/
public class Demo01StringEquals {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] arrayChar = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(arrayChar);
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //true
        System.out.println(str3.equals("Hello")); //true

        System.out.println("---------------------");

        String str4 = "hello";
        System.out.println(str1.equals(str4)); //false

        System.out.println("---------------------");

        String str5 = null;
        System.out.println("hello".equals(str5)); //推荐 false
//        System.out.println(str5.equals("hello")); //不推荐,当变量str5为空时，NullPointerException

        System.out.println("---------------------");

        String str6 = "java";
        String str7 = "JAVA";
        System.out.println(str6.equals(str7)); //false 严格区分大小写
        System.out.println(str6.equalsIgnoreCase(str7)); //true，忽略大小写


    }
}
