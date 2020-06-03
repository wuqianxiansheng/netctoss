package com.ydgk.dao.impl;

import com.ydgk.dao.UserDao;
import com.ydgk.entity.User;
import com.ydgk.util.JdbcUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    @Override
    public int insert(User user) {
        String sql = "insert into tuser values(null,?,?,?,?,?)";
        int i = JdbcUtil.executeUpdate(sql, user.getMyuser(), user.getPword(), user.getTruename(), user.getTsex(), user.getTage());
        return i;
    }

    @Override
    public int upDate(User user) {
        String sql = "update tuser set myuser=?,pword=?,truename=?,tsex=?,tage=? where id=?";
        int i = JdbcUtil.executeUpdate(sql, user.getMyuser(), user.getPword(), user.getTruename(), user.getTsex(), user.getTage(),user.getId());

        return i;
    }

    @Override
    public int deleteById(Integer id) {
        String sql = "delete from tuser where id=?";
        int i = JdbcUtil.executeUpdate(sql, id);
        return i;
    }

    @Override
    public List<User> queryAll() {
        List list = new ArrayList();
        String sql = "select * from tuser";
        List<Map<String, Object>> maps = JdbcUtil.queryForRows(sql);
        for (Map<String, Object> map : maps) {
            User user = new User();
            user.setId(Integer.parseInt(map.get("id").toString()));
            user.setMyuser(map.get("myuser").toString());
            user.setPword(map.get("pword").toString());
            user.setTruename(map.get("truename").toString());
            user.setTsex(map.get("tsex").toString());
            user.setTage(Integer.parseInt(map.get("tage").toString()));
            list.add(user);
        }

        return list;
    }

    @Override
    public User queryById(Integer id) {
        User user=null;
        String sql = "select * from tuser where id=?";
      Map<String, Object> map = JdbcUtil.queryForRow(sql,id);
        if (map != null) {
            user = new User();
            user.setId(Integer.parseInt(map.get("id").toString()));
            user.setMyuser(map.get("myuser").toString());
            user.setPword(map.get("pword").toString());
            user.setTruename(map.get("truename").toString());
            user.setTsex(map.get("tsex").toString());
            user.setTage(Integer.parseInt(map.get("tage").toString()));
        }
        return user;
    }
}
