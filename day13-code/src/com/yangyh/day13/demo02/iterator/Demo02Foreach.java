package com.yangyh.day13.demo02.iterator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @description: 增强for循环
 * @author: yangyh
 * @create: 2019-05-29 23:46
 *
 * 增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写。
 * 是JDK1.5之后出现的新特性
 * public interface Iterable<T> 实现这个接口允许对象成为 "foreach" 语句的目标。
 * public interface Collection<E> extends Iterable<E>:所有单列集合都可以使用增强for
 *
 * 增强for循环：用来遍历集合和数组
 * 格式：
 *      for(集合/数组所存储的数据类型 变量名 : 集合名/数组名) {
 *          ...
 *      }
 */
public class Demo02Foreach {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6, 10};
        // 增强for循环遍历数组
        for (int i : array) {
            System.out.println(i);
        }

        Collection<String> coll = new ArrayList();
        // 往集合中添加元素
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        // 增强for循环遍历集合
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
