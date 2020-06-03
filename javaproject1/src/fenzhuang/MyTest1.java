package fenzhuang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * 使用PreparedStatement来对tuser表进行增删改查(CRUD)
 */
public class MyTest1 {

    //从键盘输入的对象
    static Scanner sc = new Scanner(System.in);

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
                    deleteUser();
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
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.創建連接
        //参数1：数据库服务器的地址
        String url = "jdbc:mysql://127.0.0.1:3306/mytestdb";
        //用户名
        String user = "jack";
        //密码
        String password = "12345";
        Connection conn = DriverManager.getConnection(url, user, password);
        //3.創建PreparedStatement
        String sql = "insert into tuser values(null,?,?,?,?,?)";
        PreparedStatement sta = conn.prepareStatement(sql);
        //给sql语句中的一组?赋值
        sta.setString(1, username);
        sta.setString(2, upassword);
        sta.setString(3, realname);
        sta.setString(4, sex);
        sta.setInt(5, age);
        //4.执行SQL
        int i = sta.executeUpdate();
        //5.处理结果
        if (i > 0) {
            System.out.println("添加用户成功");
        } else {
            System.out.println("添加用户失败");
        }
        //6.关闭资源
        sta.close();
        conn.close();
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
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.創建連接
        //参数1：数据库服务器的地址
        String url = "jdbc:mysql://127.0.0.1:3306/mytestdb";
        //用户名
        String user = "jack";
        //密码
        String password = "12345";
        Connection conn = DriverManager.getConnection(url, user, password);
        //3.創建PreparedStatement
        String sql = "update  tuser set username=?,upassword=?,realname=?,sex=?,age=? where id=?";
        PreparedStatement sta = conn.prepareStatement(sql);
        //给sql语句中的一组?赋值
        sta.setString(1, username);
        sta.setString(2, upassword);
        sta.setString(3, realname);
        sta.setString(4, sex);
        sta.setInt(5, age);
        sta.setInt(6, id);
        //4.执行SQL
        int i = sta.executeUpdate();
        //5.处理结果
        if (i > 0) {
            System.out.println("修改用户成功");
        } else {
            System.out.println("修改用户失败");
        }
        //6.关闭资源
        sta.close();
        conn.close();
    }

    /**
     * 删除用户方法
     */
    public static void deleteUser() throws Exception {

        //接收键盘输入的数据
        System.out.println("请输入要删除的用户编号：");
        int id = sc.nextInt();
        sc.nextLine();
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.創建連接
        //参数1：数据库服务器的地址
        String url = "jdbc:mysql://127.0.0.1:3306/mytestdb";
        //用户名
        String user = "jack";
        //密码
        String password = "12345";
        Connection conn = DriverManager.getConnection(url, user, password);
        //3.創建PreparedStatement
        String sql = "delete from   tuser  where id=?";
        PreparedStatement sta = conn.prepareStatement(sql);
        //给sql语句中的一组?赋值
        sta.setInt(1, id);
        //4.执行SQL
        int i = sta.executeUpdate();
        //5.处理结果
        if (i > 0) {
            System.out.println("删除用户成功");
        } else {
            System.out.println("删除用户失败");
        }
        //6.关闭资源
        sta.close();
        conn.close();
    }

    /**
     * 查询用户列表
     */
    public static void selectAllUsers() throws Exception {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.創建連接
        //参数1：数据库服务器的地址
        String url = "jdbc:mysql://127.0.0.1:3306/mytestdb";
        //用户名
        String user = "jack";
        //密码
        String password = "12345";
        Connection conn = DriverManager.getConnection(url, user, password);
        //3.創建PreparedStatement
        String sql = "SELECT *  from  tuser";
        PreparedStatement sta = conn.prepareStatement(sql);
        //4.执行SQL语句
        ResultSet rs = sta.executeQuery();
        //5.处理结果
        System.out.println("编号\t用户名\t密码\t姓名\t性别\t年龄");

        while (rs.next()) {
            int id = rs.getInt(1);
            String username = rs.getString("username");
            String upassword = rs.getString("upassword");
            String realname = rs.getString("realname");
            String sex = rs.getString("sex");
            int age = rs.getInt("age");
            System.out.println(id + "\t" + username + "\t" + upassword + "\t" + realname + "\t" + sex + "\t" + age);
        }
        //6.关闭资源
        rs.close();
        sta.close();
        conn.close();
    }

    /**
     * 查询指定用户
     */
    public static void selectUser() throws Exception {
        //接收键盘输入的数据
        System.out.println("请输入要查询的用户编号：");
        int id = sc.nextInt();
        sc.nextLine();
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.創建連接
        //参数1：数据库服务器的地址
        String url = "jdbc:mysql://127.0.0.1:3306/mytestdb";
        //用户名
        String user = "jack";
        //密码
        String password = "12345";
        Connection conn = DriverManager.getConnection(url, user, password);
        //3.創建PreparedStatement
        String sql = "SELECT *  from  tuser where id=?";

        PreparedStatement sta = conn.prepareStatement(sql);
        sta.setInt(1, id);
        //4.执行SQL语句
        ResultSet rs = sta.executeQuery();
        //5.处理结果
        System.out.println("编号\t用户名\t密码\t姓名\t性别\t年龄");

        if (rs.next()) {
            int uid = rs.getInt(1);
            String username = rs.getString("username");
            String upassword = rs.getString("upassword");
            String realname = rs.getString("realname");
            String sex = rs.getString("sex");
            int age = rs.getInt("age");
            System.out.println(uid + "\t" + username + "\t" + upassword + "\t" + realname + "\t" + sex + "\t" + age);
        }else{
            System.out.println("查无此人！");
        }
        //6.关闭资源
        rs.close();
        sta.close();
        conn.close();
    }
}
