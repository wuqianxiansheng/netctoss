package org.wuqian.test;

import org.wuqian.test.Employ;

public class Text {
    public static void main(String[] args) {
        Employ e1 = new Employ("张三", "男", 18, "武汉", 6000);
        e1.inform();
        Employ e2 = new Employ("李四", "男", 18, "上海", 7000);
        e2.inform();
        Employ e3 = new Employ("王五", "男", 18, "天津", 8000);
        e3.inform();
        Employ e4 = new Employ("陈六", "女", 18, "重庆", 9000);
        e4.inform();
        Employ e5 = new Employ("吴七", "男", 18, "北京", 10000);
        e5.inform();
        int sum=e1.salary+e2.salary+e3.salary+e4.salary+e5.salary;
        System.out.println("总薪水:"+sum);
    }
}

