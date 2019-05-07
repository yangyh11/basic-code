package com.yangyh.day11.demo02;

/**
 * @description: 四种权限修饰符
 * @author: yangyh
 * @create: 2019-05-07 19:25
 *
 * Java中有四种权限修饰符：
 *              public  >   protected   >   (default)   >   private
 * 同一个类         YES         YES             YES             YES
 * 同一个包         YES         YES             YES             NO
 * 不同包子类        YES         YES             NO              NO
 * 不同包非子类      YES          NO              NO              NO
 *
 * 【注意事项】
 * (default)并不是关键字“default”，而是根本不写。
 **/
public class Demo01Main {
}
