package com.ydgk.test;

import com.ydgk.dao.UserDao;
import com.ydgk.dao.impl.UserDaoImpl;
import com.ydgk.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

/**
 * 使用PreparedStatement来对tuser表进行增删改查(CRUD)
 */
public class MyTest {

    //从键盘输入的对象
    static Scanner sc = new Scanner(System.in);
    static UserDao userDao = new UserDaoImpl();

    public static void main(String[] args) throws Exception {

        //用循环让用户选择一个操作
        while (true) {
            System.out.println("请选择：1.添加用户  2.修改用户 3.删除用户 4.查询用户列表  5.查询指定用户 6.退出");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":

                    //调用添加方法
                    addUser();
                    break;
                case "2":
                    updateUser();
                    break;
                case "3":
                    MyTest.deleteUser();
                    break;
                case "4":
                    selectAllUsers();
                    break;
                case "5":
                    selectUser();
                    break;
                case "6":
                    System.exit(0);
                    // return;

            }
        }
    }

    /**
     * 添加用户方法
     */
    public static void addUser() throws Exception {
        //接收從鍵盤輸入的數據
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String upassword = sc.nextLine();
        System.out.println("请输入姓名：");
        String realname = sc.nextLine();
        System.out.println("请输入性别：");
        String sex = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        sc.nextLine();
        User user = new User();
        user.setMyuser(username);
        user.setPword(upassword);
        user.setTruename(realname);
        user.setTsex(sex);
        user.setTage(age);
        int i = userDao.insert(user);
        //5.处理结果
        if (i > 0) {
            System.out.println("添加用户成功");
        } else {
            System.out.println("添加用户失败");
        }
    }

    /**
     * 修改用户方法
     */
    public static void updateUser() throws Exception {

        //接收從鍵盤輸入的數據
        System.out.println("请输入要修改的用户编号：");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("请输入新的用户名：");
        String username = sc.nextLine();
        System.out.println("请输入新的密码：");
        String upassword = sc.nextLine();
        System.out.println("请输入新的姓名：");
        String realname = sc.nextLine();
        System.out.println("请输入新的性别：");
        String sex = sc.nextLine();
        System.out.println("请输入新的年龄：");
        int age = sc.nextInt();
        sc.nextLine();
        User user = new User();
        user.setMyuser(username);
        user.setPword(upassword);
        user.setTruename(realname);
        user.setTsex(sex);
        user.setTage(age);
        user.setId(id);
        int i = userDao.upDate(user);

        //5.处理结果
        if (i > 0) {
            System.out.println("修改用户成功");
        } else {
            System.out.println("修改用户失败");
        }
    }

    /**
     * 删除用户方法
     */
    public static void deleteUser() throws Exception {

        //接收键盘输入的数据
        System.out.println("请输入要删除的用户编号：");
        int id = sc.nextInt();
        sc.nextLine();
        int i = userDao.deleteById(id);
        if (i > 0) {
            System.out.println("删除用户成功");
        } else {
            System.out.println("删除用户失败");
        }

    }

    /**
     * 查询用户列表
     */
    public static void selectAllUsers() throws Exception {
        List<User> list = userDao.queryAll();
        System.out.println("编号\t用户名\t密码\t姓名\t性别\t年龄");
        for(User user:list){
            System.out.println(user.getId()+"\t"+user.getMyuser()+"\t"+user.getPword()+"\t"+user.getTruename()+"\t"+user.getTsex()+"\t"+user.getTage());
        }
    }

    /**
     * 查询指定用户
     */
    public static void selectUser() throws Exception {
        //接收键盘输入的数据
        System.out.println("请输入要查询的用户编号：");
        int id = sc.nextInt();
        sc.nextLine();
        User user = userDao.queryById(id);
        System.out.println("编号\t用户名\t密码\t姓名\t性别\t年龄");
        System.out.println(user.getId()+"\t"+user.getMyuser()+"\t"+user.getPword()+"\t"+user.getTruename()+"\t"+user.getTsex()+"\t"+user.getTage());


    }
}
