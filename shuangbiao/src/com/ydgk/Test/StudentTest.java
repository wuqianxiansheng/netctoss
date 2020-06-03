package com.ydgk.Test;

import com.ydgk.dao.StudentDao;

import com.ydgk.dao.impl.StudentDaoImpl;


import com.ydgk.entity.Student;
import com.ydgk.entity.Tclass;


import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

    private static Scanner sc = new Scanner(System.in);
    //创建Dao的实例
    private static StudentDao stuDao = new StudentDaoImpl();

    public static void main(String[] args) {
        while (true) {
            System.out.println("请选择：1.学生列表  2.添加学生  3.退出");
            String c = sc.nextLine();
            switch (c) {
                case "1":
                    selectAll();
                    break;

                case "2":
                    addStudent();
                    break;

                case "3":
                    return;
            }
        }
    }

    //获取学生列表
    public static void selectAll() {
        List<Student> stuList = stuDao.queryAll();
        System.out.println("编号\t姓名\t年龄\t专业名称");
        for (Student s : stuList) {
            System.out.println(s.getSid() + "\t" + s.getSname() + "\t" + s.getAge() + "\t" + s.getTclass().getName());
        }
    }

    //添加学生
    public static void addStudent() {
        System.out.println("添加学生");
        System.out.print("学生编号:");
        int i1 = sc.nextInt();
        sc.nextLine();
        System.out.print("姓名:");
        String name = sc.nextLine();
        System.out.print("性别:");
        String gender = sc.nextLine();  //"男"
        System.out.print("年龄:");
        //把获取的字符串转成int类型
        int age = sc.nextInt();
        sc.nextLine(); //在nextInt()和netxtLine()之间多调一次nextLine()
        System.out.print("邮箱:");
        String email = sc.nextLine();
        System.out.println("专业编号");
        int id = sc.nextInt();
        sc.nextLine();
        //封装客户对象
        Student stu = new Student();
        stu.setSid(i1);
        stu.setSname(name);
        stu.setSex(gender);
        stu.setAge(age);
        stu.setEmail(email);
        Tclass tclass = new Tclass();
        tclass.setCid(id);
        stu.setTclass(tclass);

        int i = stuDao.insert(stu);
        if (i > 0) {
            System.out.println("添加学生成功");
        } else {
            System.out.println("添加学生失败");
        }
    }

}
