package com.ydgk.test;

import com.ydgk.util.JdbcUtil;

import java.sql.Connection;
import java.sql.Statement;

//分别使用Statement和PreparedStatement完成批量插入5万条记录，并统计各自花费的时间，从而体会批处理的效率
public class Test2 {
    public static void main(String[] args) throws Exception {
        long start=System.currentTimeMillis();
        Connection connection = JdbcUtil.getConnection();
        Statement statement = connection.createStatement();
        for (int i = 0; i <= 50000; i++) {
            String sql = "insert into t_goods(pname,price) values('" + "商品" + i + "'," + i + ")";
            statement.addBatch(sql);
        }
        statement.executeBatch();
        JdbcUtil.closeAll(statement,connection);
        long end=System.currentTimeMillis();
        System.out.println("插入5万条结束，耗时:" + (end - start) + "毫秒");//562301毫秒
    }
}
