package com.yangyh.day13.demo03.generic;


/**
 * @description: 使用自定义含有泛型的类
 * @author: yangyh
 * @create: 2019-06-02 13:52
 */
public class Demo03GenericMethod {

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();

        // 调用含有泛型的方法method01
        genericMethod.method01(10);
        genericMethod.method01("hello");
        genericMethod.method01(8.8);
        genericMethod.method01(true);

        // 调用含有泛型的静态方法
        GenericMethod.method02(12);

    }

}
