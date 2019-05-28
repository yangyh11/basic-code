package com.yangyh.day13.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * @description: Collection集合常用功能
 * @author: yangyh
 * @create: 2019-05-28 23:23
 *
 * java.util.Collection接口：
 *      1.所有单列集合的最顶层的接口，定义的是所有单列集合中共性的方法。
 *      2.任意的单列集合都可以使用Collection接口中的方法。
 * 共性的方法：
 *      1.boolean add(E e)  // 把给定的元素添加到当前集合中
 *      2.void clear()      // 清空集合中所有的元素
 *      3.boolean remove(Object o)  // 把给定的元素从当前集合中删除
 *      4.boolean contains(Object o)    // 判断当前集合中是否包含给定的元素
 *      5.boolean isEmpty()     // 判断当前集合是否不包含元素
 *      6.int size()        // 返回集合中元素的个数
 *      7.Object[] toArray()    // 把集合中的元素存储到数组中，返回
 */
public class Demo01Collection {

    public static void main(String[] args) {
        // 创建集合对象，可以使用多态
//        Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>(); // 这些方法同样适用
        System.out.println(coll); // 不是地址，说明重写了toString()方法 []

        /**
         * boolean add(E e)  // 把给定的元素添加到当前集合中
         * 返回值是一个boolean值，一般都返回true，所以不用接收
         */
        boolean b1 = coll.add("张三");
        System.out.println("b1:" + b1); // b1:true
        System.out.println(coll); // [张三]
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        System.out.println(coll); // [张三, 李四, 王五, 赵六]

        /**
         * boolean remove(Object o)  // 把给定的元素从当前集合中删除
         * 集合中存在元素，删除元素，返回true
         * 集合中不存在元素，删除失败，返回false
         */
        boolean b2 = coll.remove("王五");
        System.out.println("b2:" + b2); // b2:true
        System.out.println(coll); // [张三, 李四, 赵六]

        boolean b3 = coll.remove("王五");
        System.out.println("b3:" + b3); // b3:false
        System.out.println(coll); // [张三, 李四, 赵六]

        /**
         * boolean contains(Object o)    // 判断当前集合中是否包含给定的元素
         * 包含返回true，不包含返回false
         */
        boolean b4 = coll.contains("李四");
        System.out.println("b4:" + b4); // b4:true

        boolean b5 = coll.contains("赵四");
        System.out.println("b5:" + b5); // b5:false

        /**
         * boolean isEmpty()     // 判断当前集合是否不包含元素
         */
        boolean b6 = coll.isEmpty();
        System.out.println("b6:" + b6); // b6:false

        /**
         * int size()        // 返回集合中元素的个数
         */
        int size = coll.size();
        System.out.println("size:" + size); // size:3

        /**
         * Object[] toArray()    // 把集合中的元素存储到数组中，返回
         */
        Object[] array =  coll.toArray();
        System.out.println(Arrays.toString(array)); // [张三, 李四, 赵六]

        /**
         * void clear()      // 清空集合中所有的元素。但是不删除集合，集合还存在
         */
        System.out.println(coll); // [张三, 李四, 赵六]
        coll.clear();
        System.out.println(coll); // []
        System.out.println(coll.isEmpty()); // true

    }
}
