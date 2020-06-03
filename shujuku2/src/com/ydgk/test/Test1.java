package com.ydgk.test;

import com.ydgk.dao.UserDao;
import com.ydgk.dao.impl.UserDaoImpl;
import com.ydgk.entity.User;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        UserDao user=new UserDaoImpl();
        Scanner sc=new Scanner(System.in);

        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("请输入要查询的编号:"+id);
        User user1 = user.queryByProc(id);
        if(user!=null){
            System.out.println("名字:"+user1.getTruename()+",性别:"+user1.getTsex()+",年龄："+user1.getTage());
        }else{
            System.out.println("用户不存在");
        }
    }
}
