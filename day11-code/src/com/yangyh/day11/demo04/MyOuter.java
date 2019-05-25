package com.yangyh.day11.demo04;

/**
 * @description: 局部内部类的final问题
 * @author: yangyh
 * @create: 2019-05-08 14:42
 *
 * 局部内部类，如果希望访问所在方法的的局部变量，那么这个局部变量必须是【有效final的】。
 *
 * 备注：从Java 8+开始，只要局部变量事实不变（一次赋值），那么final关键字就可以省略。
 *
 * 局部变量必须是final的原因：
 * 1.new出来的对象是在堆内存中的。
 * 2.局部变量是跟着方法走，在栈内存当中。
 * 3.方法运行结束后，立刻出栈，局部变量就会消失。
 * 4.但是new出来的对象会在堆当中持续存在，直到垃圾回收消失。
 **/
public class MyOuter {

    public void methodOuter() {
        int num = 10;
//        num = 20; // 错误写法

        class Inner {
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
