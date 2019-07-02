package com.yangyh.day07.demo04.arraylist;

import java.util.ArrayList;

/**
 * @description: ArrayList集合的常用方法
 * @author: yangyh
 * @create: 2019-04-23 10:35
 *
 * ArrayList的常用方法：
 * public boolean add(E e)：向集合中添加元素，参数的类型与泛型一致。返回值代表添加是否成功
 * 备注：对于ArrayList集合来说，add添加动作是一定成功的，所以返回值可用可不用。
 * 但是对于其他集合（今后学习）来说，add添加动作不一定添加成功。
 *
 * public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
 *
 * public E remove(int index)：删除集合当中的元素，参数是索引编号，返回值就是被删除的元素。
 *
 * public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数。
 **/
public class Demo03ArrayListMethod {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合中添加元素
        boolean succcess = list.add("柳岩");
        System.out.println(list);//[柳岩]
        System.out.println("添加的动作是否成功：" + succcess); //true

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");
        System.out.println(list); //[柳岩, 高圆圆, 赵又廷, 李小璐, 贾乃亮]

        //从集合中获取元素。get(index)。索引值从0开始
        String name = list.get(2);
        System.out.println("第2号索引的位置元素：" + name); //赵又廷

        //从集合中删除元素。remove(index)。参数索引值从0开始，返回值是所删除的元素。
        String name2 = list.remove(3);
        System.out.println("删除的元素是：" + name2); //李小璐
        System.out.println("删除后的集合为：" + list); //[柳岩, 高圆圆, 赵又廷, 贾乃亮]

        //获取集合的长度尺寸
        int size = list.size();
        System.out.println("集合的长度是：" + size);
    }

}
