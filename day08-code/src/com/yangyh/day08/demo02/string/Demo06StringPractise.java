package com.yangyh.day08.demo02.string;

/**
 * @description: 按指定格式拼接字符串
 * @author: yangyh
 * @create: 2019-04-24 17:05
 *
 * 题目：
 * 定义一个方法，把数组{1, 2, 3}按照指定格式拼接成一个字符串。参照格式如下：[word1#word2#word3]
 *
 * 思路：
 * 1.首先准备一个int数组，内容是{1, 2, 3}
 * 2.定义一个方法，用来将数组转换为字符串。
 * 方法的三要素：
 *  方法返回值：String
 *  方法名称：fromArrayToString
 *  参数列表：int[]
 * 3.格式 [word1#word2#word3]
 * 4.调用方法，得到返回值，并打印返回值。
 **/
public class Demo06StringPractise {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        String str = fromArrayToString(ints);
        System.out.println(str);
    }

    public static String fromArrayToString(int[] array){
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                sb = sb.append("word").append(array[i]).append("#");
            } else { //最后一个
                sb = sb.append("word").append(array[i]).append("]");
            }
        }
        return sb.toString();
    }
}
