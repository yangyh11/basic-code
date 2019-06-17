package com.yangyh.day13.demo04.list;

import java.util.LinkedList;

/**
 * @description: LinkedList集合
 * @author: yangyh
 * @create: 2019-06-13 23:23
 * <p>
 * java.util.LinkedList集合 implements List集合
 * LinkedList集合的特点：
 * 1.底层是一个链表结构：查询慢，增删快。
 * 2.里边包含了大量的操作首尾的方法。
 * 注意：使用LinkedList特有的方法时，不能使用多态。
 * 增加元素：
 * 1.public void addFirst(E e) // 将指定元素插入此列表的开头
 * 2.public void addLast(E e)  // 将指定元素添加到此列表的结尾
 * 3.public void push(E e)     // 将元素推入此列表所表示的堆栈。换句话说，将该元素插入此列表的开头
 * 获取元素：
 * 1.public E getFirst()   // 返回此列表的第一个元素
 * 2.public E getLast()    // 返回此列表的最后一个元素
 * 移除元素：
 * 1.public E removeFirst()    // 移除并返回列表的第一个元素
 * 2.public E removeLast()     // 移除并返回列表的最后一个元素
 * 3.public E pop()            // 从此列表所表示的堆栈处弹出一个元素。换句话说，移除并返回此列表的第一个元素
 */
public class Demo02LinkedList {
    public static void main(String[] args) {

        method03();
    }
    /**
        public void addFirst(E e) // 将指定元素插入此列表的开头
        public void addLast(E e)  // 将指定元素添加到此列表的结尾
        public void push(E e)     // 将元素推入此列表所表示的堆栈。
     */
    private static void method01() {
        // 创建LinkedList集合对象
        LinkedList<String> linkedList = new LinkedList<>();
        // 使用add()方法往集合中添加元素
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        // public void addFirst(E e) // 将指定元素插入此列表的开头
        // 将'hello'插入到列表头部
        linkedList.addFirst("hello");
//        linkedList.push("hello"); // 等效addFirst(E e)方法
        System.out.println(linkedList); // [hello, a, b, c]

        // public void addLast(E e)  // 将指定元素添加到此列表的结尾
        // 将'坤坤'添加到列表结尾
        linkedList.addLast("坤坤");
//        linkedList.add("坤坤"); // 等效addLast(E e)方法
        System.out.println(linkedList); // [hello, a, b, c, 坤坤]
    }

    /**
        public E getFirst()   // 返回此列表的第一个元素
        public E getLast()    // 返回此列表的最后一个元素
     */
    private static void method02() {
        // 创建LinkedList集合对象
        LinkedList<String> linkedList = new LinkedList<>();
        // 使用add()方法往集合中添加元素
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        // public E getFirst()   // 返回此列表的第一个元素
        String firstStr = linkedList.getFirst();
        System.out.println("第一个元素：" + firstStr); // a

        // public E getLast()    // 返回此列表的最后一个元素
        String lastStr = linkedList.getLast();
        System.out.println("最后一个元素：" + lastStr); // c
    }

    /**
        public E removeFirst()    // 移除并返回列表的第一个元素
        public E removeLast()     // 移除并返回列表的最后一个元素
        public E pop()            // 从此列表所表示的堆栈处弹出一个元素。换句话说，移除并返回此列表的第一个元素
     */
    private static void method03() {
        // 创建LinkedList集合对象
        LinkedList<String> linkedList = new LinkedList<>();
        // 使用add()方法往集合中添加元素
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        // public E removeFirst()    // 移除并返回列表的第一个元素
        String firstStr = linkedList.removeFirst();
//        String firstStr = linkedList.pop(); // 等效removeFirst()方法
        System.out.println("移除的元素：" + firstStr); //a
        System.out.println(linkedList); // [b, c]

        // public E removeLast()     // 移除并返回列表的最后一个元素
        String lastStr = linkedList.removeLast();
        System.out.println("移除的元素：" + lastStr); // c
        System.out.println(linkedList); // [b]

    }
}
