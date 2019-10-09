package com.yangyh.day07.demo04.arraylist;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @description: 集合的遍历
 * @author: yangyh
 * @create: 2019-04-23 10:57
 **/
public class Demo04ArrayListEach {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");

        //遍历数组
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.forEach(s -> System.out.println(s));

    }
}
