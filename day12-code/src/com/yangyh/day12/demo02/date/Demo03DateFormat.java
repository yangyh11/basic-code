package com.yangyh.day12.demo02.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: DateFormat类&SimpleDateFormat类介绍
 * @author: yangyh
 * @create: 2019-05-16 23:41
 *
 * java.text.DateFormat：日期/时间格式化子类的抽象类
 * 作用：
 *      格式化（也就是日期->文本）、解析（文本->日期）
 * 成员方法：
 * 格式化：String format(Date date) 按照指定的模式，把Date日期，格式化为符合模式的字符串。
 * 解析： Date parse(String source) 把符合模式的字符串，解析为Date日期。
 *
 * DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类 ->java.text.SimpleDateFormat
 *
 * 构造方法：SimpleDateFormat(String pattern)
 *           用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
 *           参数：String pattern：传递指定的模式
 *           模式：区分大小写的
 *                  y   年
 *                  M   月
 *                  d   日
 *                  H   时
 *                  m   分
 *                  s   秒
 *           写对应的模式，会把模式替换为对应的日期和时间
 *              "yyyy-MM-dd HH:mm:ss"
 *           注意：模式中的字母不要更改，连接模式的符号可以改变
 *              "yyyy年MM月dd日 HH时mm分ss秒"
 **/
public class Demo03DateFormat {

    public static void main(String[] args) throws ParseException {
        methodFormat();
        System.out.println("=======================");
        methodParse();
    }

    /**
     * 使用DateFormat类中的方法format，把日期转换为文本
     * 使用步骤：
     *  1.创建SimpleDateFormat类对象，构造方法中传递指定的模式。
     *  2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串（文本）。
     */
    private static void methodFormat() {
        // 创建对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date now = new Date();

        // 调用format()方法
        String nowStr = sdf.format(now);

        System.out.println(now);
        System.out.println(nowStr);
    }

    /**
     * 使用DateFormat类中的的方法parse，把文本解析为日期
     * 使用步骤：
     *  1.创建SimpleDateFormat对象，构造方法中传递指定的模式。
     *  2.调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串，解析为Date日期。
     * 注意：
     * public Date parse(String source) throws ParseException
     * parse方法声明了一个异常，ParseException
     * 如果字符串与构造方法的模式不一样，那么程序就会抛出此异常
     * 调用一个抛出了异常的方法，就必须处理这个异常，要么throw继续抛出这个异常，要么try catch自己处理
     */
    private static void methodParse() throws ParseException {
        // 创建对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        // 调用format()方法
        Date date = sdf.parse("2019年05月19日 22时29分13秒");

        System.out.println(date);

    }
}
