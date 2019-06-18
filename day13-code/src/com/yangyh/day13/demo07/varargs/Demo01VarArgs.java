package com.yangyh.day13.demo07.varargs;

import java.util.Arrays;

/**
 * @description: 可变参数
 * @author: yangyh
 * @create: 2019-06-18 22:23
 * <p>
 * 可变参数：是JDK之后出现的新特性
 * 使用前提：
 * 当方法的参数列表类型已经确定的时候，但是个数不确定，就可以使用可变参数。
 * 使用格式：
 * 定义方法时：修饰符 返回值类型 方法名(数据类型...变量名){}
 * 可变参数的原理：
 * 可变参数底层就是一个数组，根据传递参数的个数不同，会创建不同长度的数组，来存储这些参数。
 * 传递的参数个数可以是0个（不传递），1，2，3...多个
 * 【注意】
 * 1.一个方法的参数列表，只能有一个可变参数。
 * 2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾。
 *
 * 可变参数的终极写法：
 * method(Object...obj);
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
        int sum = add(1, 2);
        System.out.println(sum);

        add("yangyh", 1, 2, 3, 4, 5);
    }

    /**
     * add();       就会创建一个长度为0的数组，new int[0]
     * add(10);     就会创建一个长度为1的数组，new int[]{10}
     * add(10, 20); 就会创建一个长度为2的数组，new int[]{10, 20}
     * ...
     *
     * @param arr
     * @return
     */
    private static int add(int... arr) {
        System.out.println(arr); // [I@50cbc42f     底层是一个数组
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // 如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
    private static int add(String name, int... arr) {
        System.out.println(arr); // [I@50cbc42f     底层是一个数组
        System.out.println(Arrays.toString(arr));

        System.out.println(name);

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

}
