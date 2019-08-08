package com.yangyh.day05.demo01;

/**
 * @description: 访问数组元素进行赋值
 * @author: yangyh
 * @create: 2019-04-16 17:26
 *
 * 动态初始化数组时，其中的元素会自动拥有一个默认值。规则如下：
 * 如果是整数类型（byte，short，int，long），那么默认值为0
 * 如果是浮点类型（float，double),那么默认值为0.0
 * 如果是字符类型（char），那么默认值为'\u0000'
 * 如果是布尔类型（boolean）,那么默认值为false
 * 如果是引用数据类型，那么默认值为null
 *
 * 注意事项：
 * 静态初始化其实也有默认值的过程，只不过系统自动将默认值替换成了大括号当中的具体的值。
 **/
public class Demo05ArrayUse {

    public static void main(String[] args) {

        //动态初始化一个数组
        int[] array = new int[3];

        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("------------");

        //
        array[1] = 20;
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
