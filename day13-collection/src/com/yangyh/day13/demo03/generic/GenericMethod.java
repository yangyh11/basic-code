package com.yangyh.day13.demo03.generic;

/**
 * @description: 定义和使用含有泛型的方法
 * @author: yangyh
 * @create: 2019-06-02 14:39
 * 定义含有泛型的方法：泛型定义在方法修饰符和返回值类型之间
 * 格式：
 * 修饰符 <泛型> 返回值类型 方法名(参数列表){
 *     方法体;
 * }
 * 含有泛型的方法，在调用方法的时候就确定泛型的数据类型，
 * 传递什么类型的参数，泛型就是什么类型
 */
public class GenericMethod {

    // 定义一个含有泛型的方法  泛型里的字母随意定义
    public <M> void method01(M m) {
        System.out.println(m);
    }

    // 定义一个含有泛型的静态方法
    public static <S> void method02(S s){
        System.out.println(s);
    }

}
