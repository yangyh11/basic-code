package com.yangyh.day07.demo05;

import java.util.ArrayList;

/**
 * @description: 按指定格式遍历集合字符串
 * @author: yangyh
 * @create: 2019-04-23 14:41
 *
 * 题目：定义以指定格式打印集合的方法（ArrayList作为参数类型），使用{}扩起集合，使用@分隔每个元素。
 * 格式参照 {元素@元素@元素}
 *
 * System.out.println(list)  [10, 20, 30]
 * printArrayList(list)      {10@20@30}
 **/
public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");
        System.out.println(list);
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        StringBuilder str = new StringBuilder("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                str =str.append(list.get(i)).append("}");
            } else {
                str = str.append(list.get(i)).append("@");
            }
        }
        System.out.println(str);
    }

}
