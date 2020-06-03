package util1;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.net.UnknownHostException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcUtil {
    //创建连接对象并返回
    private static ComboPooledDataSource dateSourse = new ComboPooledDataSource();
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = dateSourse.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    //获取一个预编译对象
    public static PreparedStatement getPreparedStatement(Connection connection, String sql, Object... params) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            //给SQL语句中的？赋值
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }

    //用的执行增删改的方法
    public static int executeUpdate(String sql, Object... params) {
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement ps = JdbcUtil.getPreparedStatement(connection, sql, params);
        int i = 0;
        try {
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(ps,connection);
        }
        return i;

    }

    //查询全部的方法
    public static List<Map<String, Object>> queryForRows(String sql, Object params) {
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement ps = JdbcUtil.getPreparedStatement(connection, sql, params);
        List<Map<String, Object>> list = null;
        ResultSet rs=null;
        try {
             rs = ps.executeQuery();
            //获取包含了结果集中所有列信息的对象
            ResultSetMetaData md = rs.getMetaData();
            int count = md.getColumnCount();
            //保存列名和值的Map,key是列名，value是列的值
            Map<String, Object> map = null;
            while (rs.next()) {
                map = new HashMap<>();
                for (int i = 1; i <= count; i++) {
                    //获取当前行当前列的名称
                    String columnName = md.getColumnLabel(i);
                    //获取当前行当前列的值
                    Object columnValue = rs.getObject(i);
                    map.put(columnName, columnValue);
                }
                list.add(map);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.closeAll(rs,ps,connection);
        }
        return list;
    }

    //查询单行多列
    public static Map<String, Object> queryForRow(String sql, Object params) {
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement ps = JdbcUtil.getPreparedStatement(connection, sql, params);
        Map<String, Object> map = null;
        ResultSet rs=null;
        try {
            rs = ps.executeQuery();
            //获取包含了结果集中所有列信息的对象
            ResultSetMetaData md = rs.getMetaData();
            int count = md.getColumnCount();
            //保存列名和值的Map,key是列名，value是列的值

            if (rs.next()) {
                map = new HashMap<>();
                for (int i = 1; i <= count; i++) {
                    //获取当前行当前列的名称
                    String columnName = md.getColumnLabel(i);
                    //获取当前行当前列的值
                    Object columnValue = rs.getObject(i);
                    map.put(columnName, columnValue);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.closeAll(rs,ps,connection);
        }
        return map;
    }

    //查询单列多行
    public static <T> List<T> queryForRows(Class<T> cls, String sql, Object params) {
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement ps = JdbcUtil.getPreparedStatement(connection, sql, params);
        List<T> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = ps.executeQuery();
            while (rs.next()) {
                //获取当前行当前列的值
                Object obj = rs.getObject(1);
                T t = (T) obj;
                list.add(t);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.closeAll(rs, ps, connection);
        }
        return list;

    }

    //单行单列
    public static <T> T queryForRow(Class<T> cls, String sql, Object... params) {
        T t = null;
        //得到連接對象
        Connection conn = JdbcUtil.getConnection();
        //創建预编译的SQL命令发送器
        PreparedStatement stmt = JdbcUtil.getPreparedStatement(conn, sql, params);
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery();
            if (rs.next()) {
                //获取当前行第一列的值
                Object obj = rs.getObject(1);
                //对于整型的结果，会自动映射成java.lang.Long类型
                //System.out.println(obj.getClass().getName());
                //把obj转换成T类型
                t = (T) obj;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JdbcUtil.closeAll(rs, stmt, conn);
        }
        return t;
    }

    //关闭资源
    public static void closeAll(AutoCloseable... acls) {
        for (AutoCloseable acl : acls) {
            if (acl != null) {
                try {
                    acl.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
