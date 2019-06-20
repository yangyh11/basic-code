package com.yangyh.day13.demo09.map;


import java.util.HashMap;
import java.util.Map;

/**
 * @description: Map集合概述
 * @author: yangyh
 * @create: 2019-06-20 23:25
 * java.util.Map<K, V>集合
 * Map集合的特点：
 *      1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）。
 *      2.Map集合中的元素，key和value的数据类型可以相同，也可以不同。
 *      3.Map中的元素，key是不允许重复的，value是可以重复的。
 *      4.Map集合中的元素，key和value是一一对应的。
 * java.util.HashMap<k,v>集合 implements Map<K,V>接口
 * HashMap集合的特点：
 *      1.HashMap集合底层是哈希表：查询速度非常快
 *          JDK1.8之前：哈希表（数组+链表）
 *          JDK1.8之后：哈希表（数组+链表/红黑树）
 *      2.HashMap是一个无序的集合，存储元素和取出元素的顺序可能是不一致。
 * java.util.LinkedHashMap<K,V> implements Map<K,V>接口
 * LinkedHashMap集合的特点：
 *      1.LinkedHashMap集合底层是哈希表+链表（保证迭代的顺序）。
 *      2.LinkedHashMAp集合是一个有序的集合，存储元素和取出元素的顺序是一致的。
 */
public class Demo01Map {
    public static void main(String[] args) {
        method02();
    }

    /**
     * V put(K key, V value) // 把指定的键与制定的值添加到Map集合中。
     * 返回值：V
     *      存储键值对的时候，key不重复，返回值是null
     *      存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value值。
     */
    private static void method01() {
        Map<String, String> map = new HashMap<>();
        map.put("黄晓明", "杨颖");
        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        String v1 = map.put("李晨", "范冰冰1");
        System.out.println(v1); // null

        String v2 = map.put("李晨", "范冰冰2");
        System.out.println(v2); // 范冰冰1

        System.out.println(map); // {杨过=小龙女, 尹志平=小龙女, 李晨=范冰冰2, 黄晓明=杨颖}
    }

    /**
     * V remove(Object key) // 把指定的键对应的键值对元素在Map集合中删除，返回被删除元素的值。
     *      返回值：V
     *          key存在，返回被删除的值。
     *          key不存在，返回null
     */
    private static void method02() {
        // 创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        Integer v1 = map.remove("林志玲");
        System.out.println(v1);
        System.out.println(map);

        // 必须用Integer接收，用int接收会报错
        Integer v2 = map.remove("古力娜扎");
        System.out.println(v2);
        System.out.println(map);
    }

}
