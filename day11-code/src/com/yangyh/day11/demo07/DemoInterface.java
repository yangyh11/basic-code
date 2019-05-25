package com.yangyh.day11.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 接口作为方法的参数、返回值
 * @author: yangyh
 * @create: 2019-05-25 23:00
 */
public class DemoInterface {

    public static void main(String[] args) {
        // 左边是接口，右边是实现类名称，这就是多态的写法
        List<String> list = new ArrayList<>();

        List<String> result = addName(list);
        for (String name : result) {
            System.out.println(name);
        }
    }

    private static List<String> addName(List<String> list) {
        list.add("张三");
        list.add("李四");
        list.add("王五");
        return list;
    }
}
