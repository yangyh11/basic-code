package com.yangyh.day14.demo03.exception;

import java.util.List;

/**
 * @description: 异常注意事项
 * @author: yangyh
 * @create: 2019-07-04 23:30
 * 多个异常使用捕获又该怎么处理？
 * 1.多个异常分别处理。
 * 2.多个异常一次捕获，多次处理。
 * 3.多个异常一次捕获一次处理。
 */
public class Demo02Attention {
    public static void main(String[] args) {

        method03();
    }

    /**
     * 1.多个异常分别处理。
     **/
    private static void method01() {
        try {
            int[] arr = new int[]{1, 2, 3}; // ArrayIndexOutOfBoundsException: 3
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3)); // IndexOutOfBoundsException: Index 3 out-of-bounds for length 3
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("多个异常使用捕获方式一后续代码");
    }

    /**
     * 2.多个异常一次捕获，多次处理。
     * 注意：catch里边定义的异常变量，如果有父子类关系，那么子类的异常变量必须写在上边，否则就会报错
     * ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
     **/
    private static void method02() {
        try {
            int[] arr = new int[]{1, 2, 3};
            System.out.println(arr[3]); // ArrayIndexOutOfBoundsException: 3

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3)); // IndexOutOfBoundsException: Index 3 out-of-bounds for length 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("多个异常使用捕获方式二后续代码");
    }

    /**
     * 3.多个异常一次捕获一次处理。
     * 如果多个异常变量有父子关系，那么catch写父类异常变量。也可使用异常的超类Exception。
     **/
    private static void method03() {
        try {
            int[] arr = new int[]{1, 2, 3}; // ArrayIndexOutOfBoundsException: 3
            System.out.println(arr[3]);

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3)); // IndexOutOfBoundsException: Index 3 out-of-bounds for length 3
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("多个异常使用捕获方式三后续代码");
    }

    /**
     * 运行时异常被抛出可以不处理，既不捕获也不声明抛出。
     * 默认给虚拟机处理，终止程序，什么时候不抛出运行时异常了，再来继续执行程序。
     */
    private static void method04() {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr[3]); // ArrayIndexOutOfBoundsException: 3
        List<Integer> list = List.of(1, 2, 3);
        System.out.println(list.get(3)); // IndexOutOfBoundsException: Index 3 out-of-bounds for length 3
    }


}
