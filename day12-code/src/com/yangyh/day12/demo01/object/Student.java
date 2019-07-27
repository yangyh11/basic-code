package com.yangyh.day12.demo01.object;

import java.util.Objects;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-12 15:28
 *
 * Object类的equals方法，默认比较的是两个对象的地址值，没有意义
 * 所以我们要重写equals方法，比较两个对象的属性。
 * 【问题】：
 * 隐含着一个多态
 * 多态的弊端：无法使用子类的特有的内容（属性和方法）
 * 解决：可以使用向下转型（强转）把equals方法的参数Object转换成Student
 *
 **/
public class Student {

    private String name;

    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 直接打印对象的地址值没有意义，需要重写Object类中的toString方法 打印对象的属性
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (obj instanceof Student) { // 防止类型转换异常ClassCastException
//            // 使用向下转型
//            Student stu = (Student) obj;
//            if (this.name.equals(stu.name) && this.age == stu.age) {
//                return true;
//            }
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // getClass() != o.getClass() 使用反射技术，判断o是否是Student类型，等效于!(o instanceof Student)
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
