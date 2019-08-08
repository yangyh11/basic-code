package com.yangyh.day14.demo03.exception;

/**
 * @description: 异常注意事项_finally有return语句
 * @author: yangyh
 * @create: 2019-07-14 22:33
 * 如果finally有return语句，永远返回finally中的结果，要避免该情况。
 */
public class Demo03Attention {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }

    private static int getA() {
        int a= 10;

        try {
            System.out.println("try-" + a);
            int b = a/0;
            return a;
        } catch (Exception e) {
            System.out.println("catch-" + a);
            return a;
        } finally {
            // 一定会执行的代码
            a =100;
            System.out.println("finally-" + a);
            return a;
        }
    }
}
