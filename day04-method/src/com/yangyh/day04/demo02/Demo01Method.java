package com.yangyh.day04.demo02;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-14 23:24
 *
 * 定义格式
 * public static void 方法名称(){
 *     方法体;
 * }
 *
 * 调用格式
 * 方法名称();
 *
 * 注意事项
 * 1.定义的顺序没有关系。
 * 2.方法不能嵌套，不能再方法的内部定义另一个方法。
 * 3.方法定义后不会自己执行，希望执行，一定要进行方法的调用。
 **/
public class Demo01Method {

    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
