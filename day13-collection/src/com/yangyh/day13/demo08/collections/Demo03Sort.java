package com.yangyh.day13.demo08.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @description: Collections集合工具类的排序方法2
 * @author: yangyh
 * @create: 2019-06-19 00:00
 *
 * public static <T> void sort(List<T> list, Comparator<? super T> c)   // 将集合中元素按照指定规则排序
 *
 * Comparable和Comparator的区别：
 *      Comparable：自己（this)和别人（参数）比较，自己需要实现Comparator接口，重写比较的规则compareTo方法
 *      Comparator：相当于找一个第三方的裁判，比较两个
 */
public class Demo03Sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list); // [1, 3, 2]

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2; // 升序
                return o2 - o1; // 降序
            }
        });
        System.out.println("排序后：" + list);

        /** 比较自定义类型**/
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("d吴亦凡", 18));
        list2.add(new Student("c小吴亦凡", 17));
        list2.add(new Student("b鹿晗", 20));
        list2.add(new Student("a蔡徐坤", 17));
        System.out.println(list2);

//        Collections.sort(list2, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                // 按照年龄的升序
//                return o1.getAge() - o2.getAge();
//            }
//        });

        Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 按照年龄的升序
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    // 如果两个人年龄相同，再使用姓名的第一个字升序比较
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println("排序后：" + list2);
    }
}
