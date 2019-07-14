package com.yangyh.day14.demo04.myexception;

import java.util.Scanner;

/**
 * @description: 自定义异常的练习
 * @author: yangyh
 * @create: 2019-07-14 23:23
 * 要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册！
 * 分析：
 *      1.使用数组保存已经注册过的用户名（模拟数据库）。
 *      2.使用Scanner获取用户输入的注册的用户名（模拟前端）。
 *      3.定义一个方法，对用户输入的注册的用户名进行判断。
 *          遍历存储已经注册过的用户名，获取每一个用户民
 *          使用获取到的用户名和用户输入的用户名比较
 *              true:用户名已经存在，抛出RegistException异常，告知用户：亲，该用户名已经被注册！
 *              false:继续遍历比较
 *          如果循环结束了，还没有找到重复的用户名，提示用户：恭喜您，注册成功！
 */
public class Demo01RegistException {
    // 1.使用数组保存已经注册过的用户名（模拟数据库）。
    static String[] userNames = {"张三", "李四", "王五"};

    public static void main(String[] args) /** throws RegistException**/ {
        // 2.使用Scanner获取用户输入的注册的用户名（模拟前端）。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String name = sc.next();
        checkUsername(name);
    }

    // 3.定义一个方法，对用户输入的注册的用户名进行判断。
    private static void checkUsername(String name) /** throws RegistException**/ {
        for (String userName : userNames) {
            if (name.equals(userName)) {
                try {
                    throw new RegistException("亲，该用户名已经被注册！");
                } catch (RegistException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }

        System.out.println("恭喜您，注册成功！");
    }

}
