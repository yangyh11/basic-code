package com.yangyh.day10.demo01;

/**
 * @description: 接口定义的基本格式，接口的抽象方法的使用
 * @author: yangyh
 * @create: 2019-04-30 10:36
 *
 * 接口就是多个类的公共规范。
 * 接口好是一种引用数据类型，最重要的内容就是其中的：抽象方法。
 *
 * 如何定义一个接口的格式：
 * public interface 接口与名称 {
 *     //接口内容
 * }
 *
 * 备注：换成了关键字interface后，编译生成的字节码文件仍然是：.java -> .class
 *
 * 如果是java7，那么接口可以包含的内容有：
 * 1.常量
 * 2.抽象方法
 *
 * 如果是java8，还可以额外包含有：
 * 3.默认方法
 * 4.静态方法
 *
 * 如果是java9，还可以额外包含有：
 * 5.私有方法
 *
 * 接口使用步骤：
 * 1.接口不能直接使用，必须有一个“实现类”来“实现”该接口。
 * 格式：
 * public class 实现类名称 implements 接口名称 {
 *     //..
 * }
 * 2.接口的实现类必须覆盖重写（实现）接口的所有抽象方法。
 * 实现：去掉abstract关键字，加上{}方法体。
 * 3.创建实现类的对象，进行使用。
 *
 * 注意事项：
 * 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类。
 **/
public class Demo01Interface {

    public static void main(String[] args) {
        // 错误写法！不能直接new接口对象使用
//        MyInterfaceAbstract myInterfaceAbstract = new MyInterfaceAbstract();

        // 创建实现类对象使用
        MyInterfaceAbstractImplA impl = new MyInterfaceAbstractImplA();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();

    }
}
