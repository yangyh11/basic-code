package com.yangyh.day13.demo04.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: List集合常用方法
 * @author: yangyh
 * @create: 2019-06-12 23:54
 *
 * java.util.List接口 extends java.util.Collection接口
 * List接口的特点：
 * 1.有序的集合（存储和取出元素的顺序相同）。
 * 2.允许存储重复的元素。
 * 3.有索引，可以使用普通的for循环遍历。
 *
 * List接口中常用带索引的方法（增删改查）：List接口特有的
 *
 * 1. void add(int index, E element)：在列表的指定位置插入指定元素。将当前处于该位置的元素（如果有的话）和所有后续元素向右移动（在其索引中加 1）。
 * 2. E remove(int index) ：移除列表中指定位置的元素。将所有的后续元素向左移动（将其索引减 1）。返回从列表中移除的元素。
 * 3. E set(int index, E element) ：用指定元素替换列表中指定位置的元素。反回被替换的元素
 * 4. E get(int index)：返回列表中指定位置的元素。
 *
 * 注意：操作索引的时候一定要防止索引越界异常。
 */
public class Demo01Method {
    public static void main(String[] args) {
        // 创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        // 使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        // 打印集合
        System.out.println(list); // [a, b, c, d, e] 不是地址，重写了toString

        System.out.println("------------在列表的指定位置插入指定元素------------");
        // void add(int index, E element)：在列表的指定位置插入指定元素。
        // 在b与c之间添加杨永欢
        list.add(2, "杨永欢");
        System.out.println(list); // [a, b, 杨永欢, c, d, e]

        System.out.println("------------移除列表中指定位置的元素------------");
        // E remove(int index) ：移除列表中指定位置的元素。
        // 移除元素
        String removeStr = list.remove(3);
        System.out.println("被移除的元素：" + removeStr); // c
        System.out.println(list); // [a, b, 杨永欢, d, e]

        System.out.println("------------用指定元素替换列表中指定位置的元素------------");
        // E set(int index, E element) ：用指定元素替换列表中指定位置的元素。
        // 第二个位置（索引为1）的元素替换为坤坤
        String replaceStr = list.set(1, "坤坤");
        System.out.println("被替换的元素是：" + replaceStr);
        System.out.println(list);

        System.out.println("------------返回列表中指定位置的元素------------");
        // E get(int index)：返回列表中指定位置的元素
        // 获取第三个位置（索引为2）的元素替
        String str = list.get(2);
        System.out.println("第三个位置（索引为2）的元素：" + str);
    }
}
