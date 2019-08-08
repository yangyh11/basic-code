package com.yangyh.day13.demo03.generic;

/**
 * @description: 含有泛型的接口，第一种使用方法
 * @author: yangyh
 * @create: 2019-06-03 23:03
 *
 * 含有泛型的接口，第一种使用方法：定义接口的实现类，实现接口，指定接口的泛型
 * 对应的列子：
 * public interface Iterator<E> {
 *      E next();
 *      ...
 * }
 * Scanner类实现了Iterator接口，并指定接口的泛型为String，所以重写的next()方法泛型默认就是String
 * public final class Scanner implements Iterator<String> {
 *     public String next() {
 *         ...
 *     }
 * }
 */
public class GenericInterfaceImpl1 implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
