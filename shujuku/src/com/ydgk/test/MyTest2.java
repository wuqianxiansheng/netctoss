package com.ydgk.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MyTest2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        while (true) {
            System.out.println("1.添加用户  2.修改用户  3.删除用户  4.查询所有用户  5.查询指定用户  6.退出");
            String s = sc.nextLine();
            switch (s){
                case "1":
                    addUser();
                    break;
                case "2":
                    updateUser();
                    break;
                case "3":
                    deleteUser();
                    break;
                case "4":
                    selectAllUser();
                    break;
                case "5":
                    selectUser();
                    break;
                case "6":
                    return;
            }
        }
    }
   public static void addUser()throws Exception{
        System.out.println("请输入用户名：");
       String username= sc.nextLine();
        System.out.println("请输入密码");
        String password =sc.nextLine();
        System.out.println("请输入名字");
        String name =sc.nextLine();
        System.out.println("请输入性别");
        String sex =sc.nextLine();
        System.out.println("请输入年龄");
        String age =sc.nextLine();
        //1.建立驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.与数据库连接
        String url="jdbc:mysql://127.0.0.1:3306/mydate";
        String user="root";
        String psw="8587255";
        Connection connection = DriverManager.getConnection(url, user, psw);
        //3.创建
        String sql="insert into tuser value(null,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        preparedStatement.setString(3,name);
        preparedStatement.setString(4,sex);
        preparedStatement.setString(5,age);
        int i = preparedStatement.executeUpdate();
        if (i>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
        preparedStatement.close();
        connection.close();

    }
    static void updateUser()throws Exception{
        System.out.println("请输入要修改的用户编号");
        int i1 = sc.nextInt();
        sc.nextLine();
        System.out.println("请输入新的用户名：");
        String username= sc.nextLine();
        System.out.println("请输入新密码");
        String password =sc.nextLine();
        System.out.println("请输入新名字");
        String name =sc.nextLine();
        System.out.println("请输入性别");
        String sex =sc.nextLine();
        System.out.println("请输入年龄");
        int age =sc.nextInt();
        sc.nextLine();
        //1.建立驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.与数据库连接
        String url="jdbc:mysql://127.0.0.1:3306/mydate";
        String user="root";
        String psw="8587255";
        Connection connection = DriverManager.getConnection(url, user, psw);
        //3.创建
        String sql="UPDATE  tuser set myuser=?,pword=?,truename=?,tsex=?,tage=? WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        preparedStatement.setString(3,name);
        preparedStatement.setString(4,sex);
        preparedStatement.setInt(5,age);
        preparedStatement.setInt(6,i1);
        int i = preparedStatement.executeUpdate();
        if (i>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
        preparedStatement.close();
        connection.close();

    }
    static void deleteUser()throws Exception{
        System.out.println("请输入要删除的用户编号");
        int i1 = sc.nextInt();
        sc.nextLine();

        //1.建立驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.与数据库连接
        String url="jdbc:mysql://127.0.0.1:3306/mydate";
        String user="root";
        String psw="8587255";
        Connection connection = DriverManager.getConnection(url, user, psw);
        //3.创建
        String sql="DELETE FROM tuser WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,i1);
        int i = preparedStatement.executeUpdate();
        if (i>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
        preparedStatement.close();
        connection.close();

    }
    static void selectAllUser()throws Exception{
        //1.建立驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.与数据库连接
        String url="jdbc:mysql://127.0.0.1:3306/mydate";
        String user="root";
        String psw="8587255";
        Connection connection = DriverManager.getConnection(url, user, psw);
        //3.创建
        String sql="select * from tuser";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("编号\t用户名\t密码\t姓名\t性别\t年龄");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String myuser = resultSet.getString("myuser");
            String pword = resultSet.getString("pword");
            String truename = resultSet.getString("truename");
            String tsex = resultSet.getString("tsex");
            int tage = resultSet.getInt("tage");
            System.out.println(id + "\t" + myuser + "\t" + pword + "\t" + truename + "\t" + tsex + "\t" + tage);

        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
    static void selectUser()throws Exception{
        System.out.println("请输入要查询的用户编号");
        int i1 = sc.nextInt();
        sc.nextLine();
        //1.建立驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.与数据库连接
        String url="jdbc:mysql://127.0.0.1:3306/mydate";
        String user="root";
        String psw="8587255";
        Connection connection = DriverManager.getConnection(url, user, psw);
        //3.创建
        String sql="select * from tuser WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,i1);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("编号\t用户名\t密码\t姓名\t性别\t年龄");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String myuser = resultSet.getString("myuser");
            String pword = resultSet.getString("pword");
            String truename = resultSet.getString("truename");
            String tsex = resultSet.getString("tsex");
            int tage = resultSet.getInt("tage");
            System.out.println(id + "\t" + myuser + "\t" + pword + "\t" + truename + "\t" + tsex + "\t" + tage);

        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

}
