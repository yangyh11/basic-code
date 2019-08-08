package com.yangyh.day05.demo01;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-16 17:59
 **/
public class Demo06 {

    public static void main(String[] args) {
        String[] strings = {"1","2","3"};
        String[] strings2 = {"1","2"};
        strings = strings2;
        for (int i = 0; i < strings.length; i++) {
            System.out.println(i);
            System.out.println(strings[i]);
        }

    }
}
