package com.yangyh.day13.demo03.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 泛型通配符的高级使用
 * @author: yangyh
 * @create: 2019-06-03 23:47
 * <p>
 * 泛型的上限限定：? extends E  代表使用的泛型只能是E类型以及其子类 <=E
 * 泛型的下限限定：? super E    代表使用的泛型只能是E类型以及其父类 >=E
 */
public class Demo06GenericWildcard {

    public static void main(String[] args) {
        List<Integer> list01 = new ArrayList<>();
        List<String> list02 = new ArrayList<>();
        List<Number> list03 = new ArrayList<>();
        List<Object> list04 = new ArrayList<>();

        // Number类以及其子类
        getElement1(list01);
//        getElement1(list02); // 报错
        getElement1(list03);
//        getElement1(list04); // 报错

        // // Number类以及其父类
//        getElement2(list01); // 报错
//        getElement2(list02); // 报错
        getElement2(list03);
        getElement2(list04);

        /*
            类与类之间的继承关系：
            Integer extends Number extends Object
            String  extends Object
         */
    }
    // 泛型的上限：此时的泛型?,必须是Number类以及其子类
    private static void getElement1(List<? extends Number> list) {
    }

    // 泛型的下限：此时的泛型?,必须是Number类以及其父类
    private static void getElement2(List<? super Number> list) {
    }
}
