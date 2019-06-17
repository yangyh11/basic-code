package com.yangyh.day13.demo03.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description: 使用泛型的好处
 * @author: yangyh
 * @create: 2019-06-02 13:52
 */
public class Demo01Generic {

    public static void main(String[] args) {
        // 不用泛型
//        method01();
        // 使用泛型
        mehod02();
    }

    /**
     * 创建集合对象，使用泛型
     * 好处：
     *      1.避免了类型转换的麻烦，存储的是什么类型取出的就是什么类型。
     *      2.把运行期异常（代码运行之后抛出的异常），提升到了编译器（写代码时会报错）。
     * 弊端：（忽略不计）
     *      泛型是什么类型，就只能存储什么类型的数据。
     */
    private static void mehod02() {
        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("hello");
        // 会提示异常
//        list.add(12);
        // 使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
            // 想要用String类特有的方法 length获取长度
            System.out.println(str.length());
        }

    }

    /**
     * 创建集合对象，不适用泛型
     * 好处：集合不使用泛型，默认的类型就是Object类型，可以存储任意的数据类型。
     * 弊端：不安全，会引发异常
     */
    private static void method01() {
        List list = new ArrayList();
        list.add("hello");
        list.add(11);

        // 使用迭代器遍历list集合
        Iterator it = list.iterator();
        while (it.hasNext()) {
            // 取出的元素也是Object元素
            Object obj = it.next();
            System.out.println(obj);
            // 想要用String类特有的方法 length获取长度
            // 向下转型
            // ClassCastException类型转换异常，不能巴Integer类型转换为String类型
            String s = (String) obj;
            System.out.println(s.length());
        }
    }

}
