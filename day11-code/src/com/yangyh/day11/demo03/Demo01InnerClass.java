package com.yangyh.day11.demo03;

/**
 * @description: 内部类的概念与分类
 * @author: yangyh
 * @create: 2019-05-08 10:45
 *
 * 如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类。
 * 例如：身体和心脏的关系。又如：汽车与发动车的关系。
 *
 * 分类：
 * 1.成员内部类。
 * 2.局部内部类（包含匿名内部类）。
 *
 * 成员内部类的定义格式：
 * 修饰符 class 外部类名称 {
 *     修饰符 class 内部类名称 {
 *         // ...
 *     }
 *     // ...
 * }
 *
 * 【注意】内用外，随意访问；外用内，需要内部类对象。
 *
 * ========================================
 * 如何使用成员内部类？有两种方式：
 * 1.间接方式：在外部类的方法当中，使用内部类；然后通过调用外部类的方法使用成员内部类。
 * 2.直接使用，公式：
 * 类名称 对象名 = new 类名称();
 * 【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】
 **/
public class Demo01InnerClass {

    public static void main(String[] args) {
        Body body = new Body(); // 外部类的对象
        // 通过外部类的对象，调用外部类的方法，里面再间接使用内部类Heart
        body.methodBody();

        System.out.println("===========================");

        // 直接调用，按照公司写
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
