package com.yangyh.day10.demo01;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-30 15:18
 **/
public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

    public void methodAnother() {
        // 这个公共方法是抽取出来给接口的默认方法使用的，接口实现类直接访问到接口中的默认方法，这样是错误的
//        methodCommon();
    }
}
