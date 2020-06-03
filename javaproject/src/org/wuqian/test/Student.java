package org.wuqian.test;

public class Student {
    int id ;
    String name ;
    int fs  ;
    String sex ;
    //创建构造器
    Student(int _id,String _name,int _fs,String _sex) {
        id = _id;
        name = _name;
        fs = _fs;
        sex = _sex;
    }
    void work(){
        System.out.println(id+name+":"+fs+"性别:"+sex);
    }
    public static void main(String[]args){
        Student stu1=new Student(10,"yujiang",100,"男");
        stu1.work();
        Student stu2=new Student(11,"wuqian",99,"男");
        stu2.work();
    }
}
