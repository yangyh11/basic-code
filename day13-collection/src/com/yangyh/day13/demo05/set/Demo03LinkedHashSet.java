package com.yangyh.day13.demo05.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-06-18 22:12
 *
 * java.util.LinkedHashSet<E>集合 extends HashSet<E>集合
 * LinkedHashSet集合特点：
 *      底层是一个哈希表（数组+链表/红黑树）+链表。多了一条链表（记录无序的存储顺序），保证元素有序。
 */
public class Demo03LinkedHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("www");
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("itcast");
        System.out.println(hashSet); // [abc, www, itcast]  无序，不允许重复

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("www");
        linkedHashSet.add("abc");
        linkedHashSet.add("abc");
        linkedHashSet.add("itcast");
        System.out.println(linkedHashSet); // [www, abc, itcast]  有序，不允许重复

    }
}
