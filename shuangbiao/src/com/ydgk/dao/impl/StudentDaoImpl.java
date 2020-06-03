package com.ydgk.dao.impl;

import com.ydgk.dao.StudentDao;
import com.ydgk.entity.Tclass;
import com.ydgk.entity.Student;
import com.ydgk.entity.Tclass;
import com.ydgk.util.JdbcUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> queryAll() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT sid,sname,age,cname from student s JOIN tclass t on s.cid=t.cid  ";

        List<Map<String, Object>> maps = JdbcUtil.queryForRows(sql);
        for (Map map : maps) {
            Student stu = new Student();
            stu.setSid(Integer.parseInt(map.get("sid").toString()));
            stu.setSname(map.get("sname").toString());
            stu.setAge(Integer.parseInt(map.get("age").toString()));
            Tclass tclass=new Tclass();
            tclass.setName(map.get("cname").toString());
            stu.setTclass(tclass);
            list.add(stu);

        }

        return list;
    }

    @Override
    public int insert(Student stu) {
        int i = 0;
        String sql = "INSERT  into  student(sid,sname,sex,age,email,cid) values(?,?,?,?,?,?)";
        i = JdbcUtil.executeUpdate(sql,stu.getSid(),stu.getSname(), stu.getSex(), stu.getAge(), stu.getEmail(), stu.getTclass().getCid());
        return i;

    }
}
