package com.yangyh.day13.demo09.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @description: Map集合遍历键找值的方式
 * @author: yangyh
 * @create: 2019-06-23 19:55
 * Map集合的第一种遍历方式：通过键找值的方法
 * Map集合中的方法：Set<K> keySet()    // 返回此映射中包含的键的Set视图。
 * 实现步骤：
 *      1.使用Map集合中的方法keySet(),把Map集合中所有的key取出来，存储到一个Set集合中。
 *      2.遍历Set集合，获取Map集合中的每一个key。
 *      3.通过Map集合中的方法get(key)，通过key找到value。
 */
public class Demo02MapKeySet {
    public static void main(String[] args) {
        // 创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        // 1.使用Map集合中的方法keySet(),把Map集合中所有的key取出来，存储到一个Set集合中。
        Set<String> keys = map.keySet();
        // 2.遍历Set集合，获取Map集合中的每一个key。
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            // 3.通过Map集合中的方法get(key)，通过key找到value。
            Integer v = map.get(key);
            System.out.println(key + "=" + v);
        }

        System.out.println("---------------------------------");

        // 也可以通过增强for循环遍历Set集合
        for (String key : keys) {
            // 3.通过Map集合中的方法get(key)，通过key找到value。
            Integer v = map.get(key);
            System.out.println(key + "=" + v);
        }

    }
}
