package com.ydgk.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws Exception {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.创建连接
        String url = "jdbc:mysql://127.0.0.1:3306/mydate";
        String user = "root";
        String password = "8587255";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3创建SQL命令对象
        Statement statement = connection.createStatement();
        String sal = "insert into tuser values(7,'lufei','123456','路飞','男',20)";
                //4.执行SQL语句
        int i = statement.executeUpdate(sal);
        if (i > 0) {
            System.out.println("OK");
        } else {
            System.out.println("失败");
        }
    }
}
