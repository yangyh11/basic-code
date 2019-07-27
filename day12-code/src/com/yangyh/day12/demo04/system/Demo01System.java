package com.yangyh.day12.demo04.system;

import java.util.Arrays;

/**
 * @description: System类的常用方法
 * @author: yangyh
 * @create: 2019-05-21 23:30
 *
 * java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类中常用的方法有：
 *  1.public static long currentTimeMillis()    // 返回以毫秒为单位的当前时间。
 *  2.public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)   // 将数组中指定数据拷贝到另一个数组中。
 *   【注意】
 *      a.If 如果 dest 为 null，则抛出 NullPointerException 异常。
 *      b.如果 src 为 null, 则抛出 NullPointerException 异常，并且不会修改目标数组。
 *      c.只要下列任何情况为真，则抛出 ArrayStoreException 异常并且不会修改目标数组：
 *        src 参数指的是非数组对象。
 *        dest 参数指的是非数组对象。
 *        src 参数和 dest 参数指的是那些其组件类型为不同基本类型的数组。
 *        src 参数指的是具有基本组件类型的数组且 dest 参数指的是具有引用组件类型的数组。
 *        src 参数指的是具有引用组件类型的数组且 dest 参数指的是具有基本组件类型的数组。
 *      d.只要下列任何情况为真，则抛出 IndexOutOfBoundsException 异常，并且不会修改目标数组：
 *        srcPos 参数为负。
 *        destPos 参数为负。
 *        length 参数为负。
 *        srcPos+length 大于 src.length，即源数组的长度。
 *        destPos+length 大于 dest.length，即目标数组的长度。
 **/
public class Demo01System {

    public static void main(String[] args) {
        method1();
        method2();
    }

    /**
     * public static long currentTimeMillis() // 返回以毫秒为单位的当前时间
     * 验证程序的性能
     */
    private static void method1() {
        // 程序执行前
        Long start = System.currentTimeMillis();

        // 执行for循环
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }

        // 程序执行结束
        Long end = System.currentTimeMillis();

        Long sub = end - start;
        System.out.println("for循环共耗时" + sub + "毫秒");
    }

    /**
     * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
     * 参数：
     *      src - 源数组
     *      srcPos - 源数组中的起始位置
     *      dest - 目标数组
     *      destPos - 目标数据中的起始位置
     *      length - 要复制的数组元素的数量
     * 练习：
     *      将src数组中的前3个元素，复制到dest数组的前3个位置上
     *      复制元素前：
     *      src数组[1, 2, 3, 4, 5],dest数组[6, 7, 8, 9, 10]
     *      复制元素后：
     *      src数组[1, 2, 3, 4, 5],dest数组[1, 2, 3, 9, 10]
     */
    private static void method2() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        // 复制前
        System.out.println("复制前src数组" + Arrays.toString(src));
        System.out.println("复制前dest数组" + Arrays.toString(dest));

        System.arraycopy(src, 0, dest, 0, 3);

        // 复制后
        System.out.println("复制后src数组" + Arrays.toString(src));
        System.out.println("复制后dest数组" + Arrays.toString(dest));
    }
}
