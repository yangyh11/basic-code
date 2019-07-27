package com.yangyh.day12.demo01.object;

/**
 * @description: Object类的equals方法
 * @author: yangyh
 * @create: 2019-05-12 16:08
 *
 * Person类默认继承了Object类，所以可以使用Object中的equals方法。
 * public boolean equals(Object obj) {
 *         return (this == obj);
 *     }
 * 参数：Object obj:可以传递任意的的对象
 * 基本数据类型：比较的是值。
 * 引用数据类型：比较的是俩个对象的地址值。
 * 源码解析：
 * this是谁？
 * 哪个对象调用的方法，方法中的this就是那个对象；p1调用的equals方法，所以this就是p1。
 * obj是谁？
 * 传递进来的参数
 *
 **/
public class Demo02Equals {

    public static void main(String[] args) {
        Person p1 = new Person("张三", 19);
        Person p2 = new Person("张三", 19);
        System.out.println(p1.equals(p2));

        System.out.println("=============================");

        // 重写Student类的equals方法
        Student stu1 = new Student("张三", 19);
        Student stu2 = new Student("张三", 19);
        System.out.println(stu1.equals(stu2));

        System.out.println("=============================");

        // String类重写了equals方法
        String str1 = "Rose";
        System.out.println("Rose".equals(str1));
    }



}
