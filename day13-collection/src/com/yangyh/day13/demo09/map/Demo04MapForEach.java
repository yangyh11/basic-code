package com.yangyh.day13.demo09.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @description: Map集合遍历键值对的方式
 * @author: yangyh
 * @create: 2019-07-29 23:59
 * Map集合遍历的第三种方式：使用Map.forEach方法遍历。
 * Map接口中的方法：
 *      default void forEach(BiConsumer<? super K, ? super V> action) // 是一个默认方法，在接口定义就有方法体
 * 实现步骤：
 *      1.创建BiConsumer接口的实现类，并重写accept方法，accept方法的参数就是key，value。
 *      2.调用Map接口的forEach方法，方法参数就是BiConsumer接口的实现类对象。
 */
public class Demo04MapForEach {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        // 使用Map.forEach方法遍历，通过匿名内部类实现
        map.forEach(new BiConsumer() {
            @Override
            public void accept(Object key, Object value) {
                System.out.println(key + "=" + value);
            }
        });

        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
