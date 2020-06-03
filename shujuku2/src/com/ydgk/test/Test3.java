package com.ydgk.test;

import com.ydgk.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Test3 {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement preparedStatement = null;
        String sql = "insert into t_goods(pname,price) values(?,?)";
              preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i <= 50000; i++) {
            preparedStatement.setString(1, "商品" + i);
            preparedStatement.setInt(2, i);
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
        JdbcUtil.closeAll(preparedStatement,connection);
        long end = System.currentTimeMillis();
        System.out.println("插入5万条结束，耗时:" + (end - start) + "毫秒");//608毫秒
    }
}
