package com.yangyh.day13.demo03.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description: 泛型通配符
 * @author: yangyh
 * @create: 2019-06-03 23:47
 *
 * 泛型的通配符：
 *      ?:代表任意的数据类型
 * 使用方式：
 *      不能在创建对象时使用，只能作为方法的参数使用
 */
public class Demo05GenericWildcard {

    public static void main(String[] args) {
        List<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        list01.add(3);

        List<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");
        list02.add("c");

        printList(list01);
        System.out.println("============================");
        printList(list02);
    }

    /**
     * 定义一个方法，能遍历所有的类型的List集合
     * 这时候我们不知道List集合使用什么数据类型，可以使用泛型的通配符?来接收数据类型。
     */
    private static void printList(List<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}
