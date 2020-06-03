package com.ydgk.dao.impl;

import com.ydgk.dao.UserDao;
import com.ydgk.entity.User;
import com.ydgk.util.JdbcUtil;

import java.lang.reflect.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class UserDaoImpl implements UserDao{
    @Override
    public User queryByProc(int id) {
        User user=new User();
        Connection connection = JdbcUtil.getConnection();
        //2.创建一个CallableStatement对象
        CallableStatement callableStatement =null;

        try {
            callableStatement=    connection.prepareCall("{call pro1(?,?,?,?)}");
            //设置输入参数的值
            callableStatement.setInt(1,id);
            //注册输出参数(需要指定输出参数的sql类型)
            callableStatement.registerOutParameter(2, Types.VARCHAR);
            callableStatement.registerOutParameter(3,Types.VARCHAR);
            callableStatement.registerOutParameter(4,Types.INTEGER);
            callableStatement.execute();
            //调用execute()执行存储过程
            String  name= callableStatement.getString(2);
            String sex = callableStatement.getString(3);
            int age = callableStatement.getInt(4);

                user.setTruename(name);
                user.setTsex(sex);
                user.setTage(age);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.closeAll(callableStatement,connection);
        }

        return user;
    }
}
