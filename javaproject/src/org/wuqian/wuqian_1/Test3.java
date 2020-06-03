package org.wuqian.wuqian_1;

public class Test3 {
    String name = "娜娜";
    // 成员内部类
    public class InnerClass {
        // 成员内部类的成员变量
        String name;
        // 成员内部类的构造方法
        public InnerClass() {} // 无参构造方法
        public InnerClass(String name) { // 有参构造方法
            this.name = name;
        }
        // 成员内部类的成员方法
        public void show(String name) {
            // 局部变量，成员内部类成员变量，外部类成员变量同名时的访问
            System.out.println("局部变量：" + name);
            System.out.println("成员内部类成员变量：" + this.name);
            System.out.println("外部类成员变量:" + Test3.this.name);
        }
        // 2、成员内部类中不能存在任何的静态变量和静态方法。
        // static String company = "武汉远大高科"; 编译错误
        // public static test() {} 编译错误

    }
    // 外部类的静态方法
    public static void show() {
        // 1、外部类的静态方法中不能访问成员内部变量。
         //InnerClass in = new InnerClass(); 编译错误
    }
}



