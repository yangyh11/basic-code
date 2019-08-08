package com.yangyh.day13.demo09.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @description: Map集合遍历键值对的方式
 * @author: yangyh
 * @create: 2019-06-23 20:17
 * Map集合遍历的第二种方式：使用Entry对象遍历。
 * Map集合中的方法：
 *      Set<Map.Entry<K,V>> entrySet() // 返回映射中包含的映射关系的Set视图。
 * 实现步骤：
 *      1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来，存储到一个Set集合中。
 *      2.遍历Set集合，获取每一个Entry对象。
 *      3.使用Entry对象中的getKey()，getValue()方法获取键与值。
 */
public class Demo03MapEntrySet {
    public static void main(String[] args) {
        // 创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        // 1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来，存储到一个Set集合中。
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        // 2.遍历Set集合，获取每一个Entry对象。
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            // 3.使用Entry对象中的getKey()，getValue()方法获取键与值。
            Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("-----------------------");

        // 也可以使用增强for循环遍历entrySet
        for (Entry<String, Integer> entry : entrySet) {
            // 3.使用Entry对象中的getKey()，getValue()方法获取键与值。
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
