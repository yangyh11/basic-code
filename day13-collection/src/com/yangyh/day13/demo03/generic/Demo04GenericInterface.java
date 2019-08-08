package com.yangyh.day13.demo03.generic;

/**
 * @description: 测试含有泛型的接口
 * @author: yangyh
 * @create: 2019-06-03 23:11
 */
public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("3");
//        gi1.method(3);// 会报错

        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2();
        gi2.method(1);
//        gi2.method("hello");// 会报错

        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2();
        gi3.method(1.1);
    }
}
