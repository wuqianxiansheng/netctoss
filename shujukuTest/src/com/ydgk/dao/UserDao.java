package com.ydgk.dao;

import com.ydgk.entity.User;

import java.util.List;

public interface UserDao {
    //添加一条记录
    int insert(User user);

    //修改一条记录
    int upDate(User user);

    //根据主键删除一条记录
    int deleteById(Integer id);

    //查询所有记录--全查询
    List<User> queryAll();

    //根据主键查询一条记录
    User queryById(Integer id);

}
