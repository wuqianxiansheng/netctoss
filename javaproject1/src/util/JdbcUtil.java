package util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcUtil {
    private static String url = "jdbc:mysql://127.0.0.1:3306/mydate";
    //用户名
    private static String user = "root";
    //密码
    private static String password = "8587255";

    //在静态代码块中加载驱动
    static {
        //1.加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //创建连接对象并返回
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    /**
     * 获取一个预编译的SQL命令发送器对象
     *
     * @param conn
     * @param sql
     * @param params
     * @return
     */
    public static PreparedStatement getPreparedStatement(Connection conn, String sql, Object... params) {

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    /**
     * 通用的执行增删改的方法
     *
     * @param sql
     * @param params
     * @return
     */
    public static int excuteUpdate(String sql, Object... params) {
        int i = 0;
        Connection conn = getConnection();
        PreparedStatement preparedStatement = getPreparedStatement(conn, sql, params);
        try {
            i = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeAll(preparedStatement, conn);
        return i;
    }

    /**
     * 通用的查询的方法,返回多行多列结果集
     *
     * @param sql
     * @param params
     * @return
     */
    public static List<Map<String, Object>> queryForRows(String sql, Object... params) {
        List<Map<String, Object>> list = new ArrayList();
        Connection conn = getConnection();
        PreparedStatement preparedStatement = getPreparedStatement(conn, sql, params);
        ResultSet resultSet = null;
        try {
            resultSet = preparedStatement.executeQuery();
            //获取包含了结果集中所有列信息的对象
            ResultSetMetaData metaData = resultSet.getMetaData();
            //获取结果集中的列的数量
            int columnCount = metaData.getColumnCount();
            //保存列名和值的Map,key是列名，value是列的值
            Map<String, Object> map = null;
            while (resultSet != null) {
                //实例化
                map = new HashMap<>();
                //遍历当前行的每一列
                for (int i = 1; i < columnCount; i++) {
                    //获取当前列的名称
                    String columnLabel = metaData.getColumnLabel(i);
                    Object columnValue = resultSet.getObject(i);
                    map.put(columnLabel, columnValue);
                }
                list.add(map);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.closeAll(resultSet,preparedStatement,conn);
        }
        return list;
    }
    /**
     * 通用的查询的方法,返回单行多列结果集
     *
     * @param sql    针对返回单行多列的查询语句
     * @param params 赋给每个输入参数?的值s
     * @return 返回多行多列结果集, Map中封装的是每一行所有列的数据
     */
    public static Map<String, Object> queryForRow(String sql, Object... params) {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = getPreparedStatement(conn, sql, params);
        ResultSet resultSet = null;
        //保存列名和值的Map,key是列名，value是列的值
        Map<String, Object> map = null;
        try {
            resultSet = preparedStatement.executeQuery();
            //获取包含了结果集中所有列信息的对象
            ResultSetMetaData metaData = resultSet.getMetaData();
            //获取结果集中的列的数量
            int columnCount = metaData.getColumnCount();

            while (resultSet != null) {
                //实例化
                map = new HashMap<>();
                //遍历当前行的每一列
                for (int i = 1; i < columnCount; i++) {
                    //获取当前列的名称
                    String columnLabel = metaData.getColumnLabel(i);
                    Object columnValue = resultSet.getObject(i);
                    map.put(columnLabel, columnValue);
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.closeAll(resultSet,preparedStatement,conn);
        }
        return map;
    }
    /**
     * 通用的查询的方法,返回单列多行结果集
     *
     * @param cls    列的值的类型映射的Class对象
     * @param sql    针对单列多行的查询语句
     * @param params
     * @param <T>
     * @return
     */
    public static <T> List<T> queryForRows(Class<T> cls, String sql, Object... params) {
        List<T> list = new ArrayList<>();
        //得到連接對象
        Connection conn = JdbcUtil.getConnection();
        //創建预编译的SQL命令发送器
        PreparedStatement stmt = JdbcUtil.getPreparedStatement(conn, sql, params);
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery();
            while (rs.next()) {
                //获取当前行第一列的值
                Object obj = rs.getObject(1);
                //把obj转换成T类型
                T t = (T) obj;
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JdbcUtil.closeAll(rs, stmt, conn);
        }
        return list;
    }
    /**
     * 通用的查询的方法,返回单列单行结果集
     *
     * @param cls    列的值的类型映射的Class对象
     * @param sql    针对单列多行的查询语句
     * @param params
     * @param <T>
     * @return
     */
    public static <T> T queryForRow(Class<T> cls, String sql, Object... params) {
        T t = null;
        //得到連接對象
        Connection conn = JdbcUtil.getConnection();
        //創建预编译的SQL命令发送器
        PreparedStatement stmt = JdbcUtil.getPreparedStatement(conn, sql, params);
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery();
            if(rs.next()) {
                //获取当前行第一列的值
                Object obj = rs.getObject(1);
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

    /**
     * @param cls
     */
    public static void closeAll(AutoCloseable... cls) {
        for (AutoCloseable auto : cls) {
            try {
                auto.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
