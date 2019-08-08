package com.yangyh.day13.demo09.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @description: LinkedHashMap集合
 * @author: yangyh
 * @create: 2019-06-25 00:03
 * java.util.LinkedHashMap<K, V> extends HashMap<K,V>
 * Map接口的哈希表和链接列表实现，具有可预知的迭代顺序。
 * 底层原理：
 *      哈希表+链表（记录元素的顺序）
 */
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("a", "d");
        System.out.println(map); // {a=d, b=b, c=c}     key不允许重复，无序

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a", "a");
        linkedHashMap.put("c", "c");
        linkedHashMap.put("b", "b");
        linkedHashMap.put("a", "d");
        System.out.println(linkedHashMap); // {a=d, c=c, b=b}   key不允许重复，有序
    }
}
