package org.wuqian.wuqian_1;

public class InnerClassDemo {
    public static void main(String[] args) {
        Test3.InnerClass in = new Test3().new InnerClass("小明");
        // 获取成员内内部类的属性
        System.out.println(in.name); // 输出：小花
        // 调用成员内内部类的方法
        in.show("小花");
    }

}
