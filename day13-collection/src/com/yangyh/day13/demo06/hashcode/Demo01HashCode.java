package com.yangyh.day13.demo06.hashcode;

/**
 * @description: 哈希值
 * @author: yangyh
 * @create: 2019-06-17 22:18
 *
 * 哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来的地址，不是数据实际存储的物理地址）。
 * 在Object类中有一个方法，可以获取对象的哈希值。
 * public native int hashCode()     // 返回该对象的哈希码值
 *  native：代表该方法调用的是本地操作系统的方法。
 */
public class Demo01HashCode {
    public static void main(String[] args) {
        // Object类是所有类的父类，所以Person类的对象可以使用Object类的hashCode()方法
        Person person = new Person();
        int code = person.hashCode();
        System.out.println(code); // 475266352

        // toString()的源码 return getClass().getName() + "@" + Integer.toHexString(hashCode());
        // toString()返回的是该类哈希值的十六进制
        System.out.println(person.toString()); //com.yangyh.day13.demo06.hashcode.Person@1c53fd30

    }
}
