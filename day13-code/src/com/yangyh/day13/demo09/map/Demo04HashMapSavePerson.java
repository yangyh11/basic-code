package com.yangyh.day13.demo09.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: HashMap存储自定义类型键值
 * @author: yangyh
 * @create: 2019-06-23 22:10
 * HashMap存储自定义类型键值
 * Map集合保证key是唯一的：
 *      作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
 */
public class Demo04HashMapSavePerson {
    public static void main(String[] args) {
        method02();
    }

    /**
     * HashMap存储自定义类型键值
     * key：String类型
     *      String类型重写了hashCode方法和equals方法，可以保证key唯一
     * value：Person类型
     *        value可以重复（同名同年龄的人视为同一个）
     */
    private static void method01() {
        // 创建HashMap集合
        Map<String, Person> map = new HashMap<>();
        // 往集合中添加元素
        map.put("北京", new Person("张三", 18));
        map.put("上海", new Person("李四", 19));
        map.put("广州", new Person("王五", 20));
        map.put("北京", new Person("赵六", 18));
        System.out.println(map); // {上海=Person{name='李四', age=19}, 广州=Person{name='王五', age=20}, 北京=Person{name='赵六', age=18}}
    }

    /**
     * HashMap存储自定义类型键值
     * key:Person类型
     *     Person类型就必须重写hashCode方法和equals方法，以保证key唯一
     * value：String类型
     *     可以重复
     */
    private static void method02() {
        // 创建HashMap集合
        Map<Person, String> map = new HashMap<>();
        // 往集合中添加元素
        map.put(new Person("女王", 18), "英国");
        map.put(new Person("秦始皇", 18), "秦国");
        map.put(new Person("普京", 18), "俄罗斯");
        map.put(new Person("女王", 18), "毛里求斯");
        System.out.println(map); // {Person{name='女王', age=18}=毛里求斯, Person{name='秦始皇', age=18}=秦国, Person{name='普京', age=18}=俄罗斯}
    }
}
