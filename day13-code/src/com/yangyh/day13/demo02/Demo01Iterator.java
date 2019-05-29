package com.yangyh.day13.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description: Iterator迭代器
 * @author: yangyh
 * @create: 2019-05-29 23:15
 *
 * java.util.Iterator接口：迭代器（对集合进行遍历）
 * 有两个常用的方法：
 *      1.boolean hasNext() // 如果仍有元素可以迭代，则返回true
 *              判断集合还有没有下一个元素
 *      2.E next()      // 返回迭代的下一个元素
 *              取出集合的下一个元素
 * Iterator迭代器是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方式比较特殊
 * Collection接口中有一个方法，叫Iterator<E> iterator()，这个方法返回的就是迭代器的实现对象
 *      Iterator<E> iterator()  // 返回此Collection的元素上进行迭代的迭代器。
 *
 * 迭代器使用步骤（重点）：
 *      1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接受（多态）。
 *      2.使用Iterator接口中的方法hasNext()判断还有没有下一个元素。
 *      3.使用Iterator接口中的方法next()取出下一个元素。
 */
public class Demo01Iterator {

    public static void main(String[] args) {
        // 创建一个集合对象
        Collection<String> coll = new ArrayList();
        // 往集合中添加元素
        coll.add("姚明");
        coll.add("科比");
        coll.add("库里");
        coll.add("蔡徐坤");


        /**
         * 使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接受（多态）
         * 注意: Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         */
        // 获取迭代器
        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()) { // 迭代器有下一个元素就执行
            // 获取下一个元素
            String str = iterator.next();
            System.out.println(str);
        }

    }
}
