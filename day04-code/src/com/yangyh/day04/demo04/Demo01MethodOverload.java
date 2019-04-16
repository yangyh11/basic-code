package com.yangyh.day04.demo04;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-16 11:31
 *
 * 对于功能相似的方法来说，因为参数列表不一样，却需要记住那么多不同的方法名称，太麻烦。
 *
 * 方法的重载（Overload）:在一个类中多个方法的名称一样，但是参数列表不一样。
 * 好处：只需要记住唯一一个方法名称，就可以实现类似的多个功能。
 *
 * 方法重载与下列因素有关：
 * 1.参数个数不同。
 * 2.参数类型不同。
 * 3.参数的多类型顺序不同。
 *
 *方法重载与下列因素无关：
 * 1.方法的修饰符。
 * 2.方法的返回值类型。
 * 2.参数的名称。
 **/
public class Demo01MethodOverload {

    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
//        System.out.println(sum(10,20,30,40,50)); //找不到任何方法匹配，所以错误！
    }


    public static int sum(int a, int b){
        System.out.println("有2个参数的方法执行！");
        return a+b;
    }

    //方法的重载与方法的修饰符无关
//    int sum(int a, int b){
//        System.out.println("有2个参数的方法执行！");
//        return a+b;
//    }

    //方法重载与方法返回值类型无关
//    public static double sum(int a, int b){
//        System.out.println("有2个参数的方法执行！");
//        return a+b;
//    }

    //重载与参数的名称无关
//    public static int sum(int x, int y){
//        System.out.println("有2个参数的方法执行！");
//        return x+y;
//    }

    //参数的类型不同
    public static int sum(double a, double b){
        System.out.println("有2个参数的方法执行！");
        return (int)(a+b);
    }

    //参数的多类型顺序不同
    public static int sum(int a, double b){
        System.out.println("有2个参数的方法执行！");
        return (int)(a+b);
    }

    //参数的多类型顺序不同
    public static int sum(double a, int b){
        System.out.println("有2个参数的方法执行！");
        return (int)(a+b);
    }

    //参数的个数不同
    public static int sum(int a, int b, int c){
        System.out.println("有3个参数的方法执行！");
        return a+b+c;
    }

    //参数的个数不同
    public static int sum(int a, int b, int c, int d){
        System.out.println("有4个参数的方法执行！");
        return a+b+c+d;
    }
}
