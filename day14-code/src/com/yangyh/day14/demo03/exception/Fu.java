package com.yangyh.day14.demo03.exception;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-07-14 22:41
 * 子父类异常：
 *  1.如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常或是父类异常的子类或者不抛出异常。
 *  2.父类方法没有抛出异常，子类重写父类该方法时不可抛出异常的超类（Exception）。可抛出Exception的子类。
 * 注意：
 *  父类异常是什么样，子类异常就是什么样。
 */
public class Fu {
    public void method01() throws IndexOutOfBoundsException{}
    public void method02() throws IndexOutOfBoundsException{}
    public void method03() throws IndexOutOfBoundsException{}
    public void method04(){}
}

class Zi extends Fu {
    // 子类重写父类方法时，抛出和父类相同的异常
    @Override
    public void method01() throws IndexOutOfBoundsException {
        super.method01();
    }

    // 子类重写父类方法时，抛出是父类异常的子类
    @Override
    public void method02() throws ArrayIndexOutOfBoundsException {
        super.method02();
    }

    // 子类重写父类方法时，不抛出异常
    @Override
    public void method03() {
        super.method03();
    }

    // 父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常的超类（Exception）。可抛出Exception的子类。
//    @Override
//    public void method04() throws Exception{
//        super.method04();
//    }

    // 父类方法没有抛出异常，可抛出Exception的子类。
    @Override
    public void method04() throws ArrayIndexOutOfBoundsException{
        super.method04();
    }
}
