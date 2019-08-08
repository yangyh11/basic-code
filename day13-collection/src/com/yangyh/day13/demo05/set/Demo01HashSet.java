package com.yangyh.day13.demo05.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @description: HashSet集合介绍
 * @author: yangyh
 * @create: 2019-06-17 20:59
 * java.util Set<E>接口 extends Collection<E>接口
 * Set接口的特点：
 *      1.不允许存储重复的元素。
 *      2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历。
 * java.util HashSet<E>集合 implements Set<E>
 * HashSet的特点：
 *      1.不允许存储重复的元素。
 *      2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历。
 *      3.是一个无序的集合，存储元素和取出元素的顺序有可能不一致。
 *      4.底层是一个哈希表结构（查询的速度非常快）。
 */
public class Demo01HashSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        // 使用add方法往集合中添加元素
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);
        // 使用迭代器遍历set集合
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            int i = it.next();
            System.out.println(i);
        }

        System.out.println("====================");

        // 使用增强for循环遍历set集合
        for (Integer i : hashSet) {
            System.out.println(i);
        }
    }

}
