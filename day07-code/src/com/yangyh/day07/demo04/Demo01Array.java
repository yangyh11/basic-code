package com.yangyh.day07.demo04;

/**
 * @description: 对象数组
 * @author: yangyh
 * @create: 2019-04-22 08:37
 *
 * 题目：定义一个数组，用来存储3个Person对象
 *
 * 数组有一个缺点：一旦创建，程序运行期间长度不可以改变。
 **/
public class Demo01Array {

    public static void main(String[] args) {

        Person[] array = new Person[3];

        Person one = new Person("Jude", 18);
        Person two = new Person("Lucy", 20);
        Person three = new Person("Tom", 25);

        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[0]); //地址值
        System.out.println(array[1]); //地址值
        System.out.println(array[2]); //地址值

        System.out.println(array[0].getName());
        System.out.println(array[1].getName());
        System.out.println(array[2].getName());
    }
}
