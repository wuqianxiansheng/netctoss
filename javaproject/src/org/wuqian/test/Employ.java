package org.wuqian.test;

public class Employ {
    String name;
    String sex;
    int age;
    String origin;//籍贯
    int salary;

    public Employ(String _name, String _sex, int _age, String _origin, int _salary) {
        name = _name;
        sex = _sex;
        age = _age;
        origin = _origin;
        salary = _salary;
    }

    public void inform() {
        System.out.println("名字：" + name + "   性别：" + sex + "   年龄：" + age + "  籍贯：" + origin + "   薪水：" + salary);

    }

    public void many() {

    }
}
