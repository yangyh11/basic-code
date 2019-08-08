package com.yangyh.day13.demo09.map;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @description: JDK9对集合添加的优化_of方法
 * @author: yangyh
 * @create: 2019-06-25 07:55
 * JDK9的新特性：
 * List接口，Set接口，Map接口：里边增加了一个静态的方法of，可以给几个一次性添加多个元素。
 * List接口:static <E> List<E> of(E... elements)
 * Set接口:static <E> Set<E> of(E... elements)
 * Map接口:static <K, V> Map<K, V> of(k1, v1, k2, v2)
 * 注意：
 * 1.of方法只适用于List接口、Set接口、Map接口，不适用与接口的实现类。
 * 2.of方法的返回值是一个不能改变的集合，集合不能再使用add，put方法添加元素，会抛出异常。
 * 3.Set接口和Map接口在调用of方法的时候，不能有重复的时候，否则会抛出异常。
 */
public class Demo08Jdk9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "a", "c", "d");
        System.out.println(list); // [a, b, a, c, d]
//        list.add("a"); // UnsupportedOperationException 不支持操作异常

//        Set<String> set = Set.of("a", "b", "a", "c", "d"); // IllegalArgumentException: duplicate element: a
        Set<String> set = Set.of("a", "b", "c", "d");
        System.out.println(set); // [c, b, a, d]
//        set.add("e");// UnsupportedOperationException 不支持操作异常

//        Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3, "d", 4, "a", 2); // IllegalArgumentException: duplicate key: a
        Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3, "d", 4);
        System.out.println(map); // {d=4, a=1, c=3, b=2}
        map.put("e", 5); // UnsupportedOperationException 不支持操作异常

    }
}
