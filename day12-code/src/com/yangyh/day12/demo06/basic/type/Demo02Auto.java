package com.yangyh.day12.demo06.basic.type;

import java.util.ArrayList;

/**
 * @description: 包装类_自动装箱与自动拆箱
 * @author: yangyh
 * @create: 2019-05-26 22:50
 *
 * 自动装箱和自动拆箱：基本类型的数据和包装类之间可以自动的相互转换
 * JDK1.5之后出现的新特性
 */
public class Demo02Auto {

    public static void main(String[] args) {
        /*
            自动装箱：直接把int类型的整数赋值给包装类
            Integer in = 1; //就相当于Integer in = new Integer(1);
         */
        Integer in = 1;

        /*
            自动拆箱：in是包装类，无法直接参与运算，可以自动转换为基本数据类型，再进行计算。
            in + 2; // 相当于 in.intValue() + 2 = 3
            in = 3; // 又是一个自动装箱
         */
        in = in + 2;

        /*
            ArrayList集合无法直接存储整数，可以存储Integer包装类
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // 自动装箱 list.add(new Integer(1))
        int a = list.get(0); // 自动拆箱 list.get(0).intValue;

    }
}
