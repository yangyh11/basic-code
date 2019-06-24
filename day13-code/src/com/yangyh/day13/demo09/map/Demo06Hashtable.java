package com.yangyh.day13.demo09.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @description: Hashtable
 * @author: yangyh
 * @create: 2019-06-25 00:18
 * java.util.Hashtable<K, V>集合 implements Map<K, V>接口
 *
 * Hashtable:底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢。
 * HashMap:底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快。
 *
 * HashMap集合（之前学的所有集合）：可以存储null值，null键
 * Hashtable集合，不能存储null值，null键
 *
 * Hashtable和Vector集合一样，在jdk1.2版本之后被更先进的集合（HashMap，ArrayList）取代了
 * Hashtable的子类Properties仍然活跃在历史的舞台
 * Properties集合是一个唯一和IO流相结合的集合。
 */
public class Demo06Hashtable {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map); // {null=null, b=null}

        Map<String, String> table = new Hashtable<>();
//        table.put(null, "a"); // NullPointerException
//        table.put("b", null); // NullPointerException
        table.put(null, null); // NullPointerException


    }
}
