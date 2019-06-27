package com.yangyh.day13.demo09.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @description: 计算一个字符串中每个字符出现次数
 * @author: yangyh
 * @create: 2019-06-25 07:31
 * 分析：
 *      1.使用Scanner获取用户输入的字符串。
 *      2.创建Map集合，key是字符串中的字符，value是字符的个数。
 *      3.遍历字符串，获取每一个字符。
 *      4.使用获取到的字符，去Map集合判断key是否存在
 *          key存在：
 *              通过字符（key），获取字符个数（value)
 *              value++
 *              put(key, value),把新的字符个数存储到集合中
 *          key不存在：
 *              put(key, 1)
 *      5.遍历集合，输出结果。
 */
public class Demo07Practice {
    public static void main(String[] args) {
        Map<Object, Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();

        char[] array = str.toCharArray();
        for (char c : array) {
            if (map.containsKey(c)) {
                Integer count = map.get(c);
                count++;
                map.put(c, count);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
