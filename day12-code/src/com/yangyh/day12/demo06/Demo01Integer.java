package com.yangyh.day12.demo06;

/**
 * @description: 包装类_装箱与拆箱
 * @author: yangyh
 * @create: 2019-05-26 21:30
 * 装箱：将基本类型的数据，包装到包装类中（基本类型 -> 包装类）
 *      构造方法：
 *          1.public Integer(int value) // 构造一个新分配的Integer对象，它表示指定的int值。
 *          2.public Integer(String s) throws NumberFormatException  // 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
 *                  传递的字符串，必须是基本数据类型的的字符串，否则会抛出异常。
 *      静态方法：
 *          1.public static Integer valueOf(int i) // 返回一个指定的int值的Integer实例。
 *          2.public static Integer valueOf(String s) throws NumberFormatException // 返回保存指定的String的值的Integer对象。
 * 拆箱：在包装类中取出基本类型的数据（包装类 -> 基本类型的数据）
 *      成员方法：
 *          public int intValue() // 以int类型返回该Integer的值。
 */
public class Demo01Integer {

    public static void main(String[] args) {
        // 装箱：（基本类型 -> 包装类）
        // 构造方法
        Integer n1 = new Integer(1); // 方法上有横线，说明方法过时了
        System.out.println("n1:" + n1);

//        Integer n2 = new Integer("a"); // NumberFormatException
        Integer n2 = new Integer("1");
        System.out.println("n2:" + n2);

        // 静态方法
        Integer n3 = Integer.valueOf(1);
        System.out.println("n3:" + n3);

//        Integer n4 = Integer.valueOf("a"); // NumberFormatException 数字格式化异常
        Integer n4 = Integer.valueOf("1");
        System.out.println("n4:" + n4);

        // 拆箱：(包装类 -> 基本类型的数据)
        int i = n4.intValue();
        System.out.println("i:" + i);


    }

}
