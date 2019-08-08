package com.yangyh.day13.demo08.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description: Collections集合工具类
 * @author: yangyh
 * @create: 2019-06-18 22:53
 * java.util.Collections是集合工具类，用来对集合进行操作。部分方法如下：
 *      1.public static <T> boolean addAll(Collection<? super T> c, T... elements)  // 往集合中添加多个元素
 *      2.public static void shuffle(List<?> list)  // 洗牌，打乱顺序：打乱集合顺序
 */
public class Demo01Collections {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // 往集合中添加多个元素
        /*list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);*/
        Collections.addAll(list, 1, 2, 3, 4);
        System.out.println(list); // [1, 2, 3, 4]

        // 打乱集合 每次打乱后的集合顺序不一样
        Collections.shuffle(list);

        System.out.println(list); // [2, 1, 4, 3]

    }
}
