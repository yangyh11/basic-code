package com.yangyh.day16.demo02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description: Lambda表达式有参数有返回值的练习
 * @author: yangyh
 * @create: 2019-10-09 23:45
 * 需求：使用数组存储多个User对象
 * 对数组中的User对象使用Arrays的sort方法通过年龄进行升序排序
 */
public class Demo02Arrays {
    public static void main(String[] args) {
        // 使用数组存储多个User对象
        User[] users = {
                new User("柳岩", 30),
                new User("迪丽热巴", 21),
                new User("古力娜扎", 20),
        };
        // 对数组中的User对象使用Arrays的sort方法通过年龄进行升序（前面减后面）排序
//        Arrays.sort(users, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        // 使用Lambda表达式，简化匿名内部类
        Arrays.sort(users, (User o1, User o2) -> {return o1.getAge() - o2.getAge();});
        
        // 遍历打印数组
        for (User user : users) {
            System.out.println(user);
        }
    }
}
