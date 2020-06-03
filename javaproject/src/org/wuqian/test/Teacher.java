package org.wuqian.test;

public class Teacher {
    int age;
    String name;
    int salary;
    String sex;

    void speak() {
        System.out.println("好好学习");
    }

    void write() {
        System.out.println("天天向上");
    }

    void showInfo() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(sex);
    }

    public static void main(String[] args) {
        Teacher tea = new Teacher();
        tea.speak();
        tea.write();
        tea.age = 20;
        tea.name = "wa";
        tea.salary = 5000;
        tea.sex = "男";
        tea.showInfo();
    }
}
