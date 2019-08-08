package com.yangyh.day13.demo03.generic;

/**
 * @description: 含有泛型的接口，第二种使用方法
 * @author: yangyh
 * @create: 2019-06-03 23:03
 *
 * 含有泛型的接口，第二种使用方法：接口使用什么泛型，实现类就使用什么泛型，类跟着接口走。
 *                             就相当于定义一个含有泛型的实现类，创建对象的时候确定是什么泛型。
 * 对应的列子：
 * public interface List<E> {
 *      boolean add(E e);
 *      ...
 * }
 * ArrayList类实现了List接口，并使用与接口一样的泛型
 *     public boolean add(E e) {}
 * }
 */
public class GenericInterfaceImpl2<E> implements GenericInterface<E> {

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
