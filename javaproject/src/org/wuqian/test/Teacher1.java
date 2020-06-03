package org.wuqian.test;

public class Teacher1 {
    int age;
    String name;
    int salary;
    String sex;
    Teacher1(int _age,String _name,int _salary,String _sex){
        age=_age;
        name=_name;
        salary=_salary;
        sex=_sex;
    }

    void speak() {
        System.out.println("好好学习");
    }

    void write() {
        System.out.println("天天向上");
    }
    void work(){System.out.println();}

    public static void main(String[] args) {
        Teacher1 tea = new Teacher1(20,"wuqian",10000,"男");
        tea.speak();
        tea.write();

    }
}