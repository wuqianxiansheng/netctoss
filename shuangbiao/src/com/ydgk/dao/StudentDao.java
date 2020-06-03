package com.ydgk.dao;

import com.ydgk.entity.Student;

import java.util.List;

public interface StudentDao {
    //查询学生的编号，姓名，年龄，专业名称
    List<Student> queryAll();
    //插入一个记录
    int insert(Student stu);
}
