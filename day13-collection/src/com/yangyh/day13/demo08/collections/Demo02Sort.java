package com.yangyh.day13.demo08.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description: Collections集合工具类的排序方法
 * @author: yangyh
 * @create: 2019-06-18 23:31
 *
 *  public static <T extends Comparable<? super T>> void sort(List<T> list) // 将集合中的元素按照默认规则排序
 *
 * 【注意】
 * sort(List<T> list)使用前提：
 * 被排序的集合里边存储的元素，必须实现Comparable接口，重写接口中compareTo方法定义排序的规则。
 *
 * Comparable接口的排序规则：
 *      自己(this) - 参数   // 升序，反之降序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list); // [1, 3, 2]

        // 将集合中的元素按照默认规则排序
        Collections.sort(list); // 默认是升序
        System.out.println("排序后：" + list); // [1, 2, 3]

        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("c");
        list2.add("b");
        System.out.println(list2); // [a, c, b]

        // 将集合中的元素按照默认规则排序
        Collections.sort(list2); // 默认是升序
        System.out.println("排序后：" + list2); // [a, b, c]


        // 自定义排序规则
        List<Person> list3 = new ArrayList<>();
        list3.add(new Person("小明", 18));
        list3.add(new Person("小文", 20));
        list3.add(new Person("小武", 19));
        System.out.println(list3); // [a, c, b]

//        Collections.sort(list3); // 会报错 必须要实现Comparable接口，重写compareTo方法
        Collections.sort(list3);

        System.out.println("排序后：" + list3); // [a, b, c]

    }
}
