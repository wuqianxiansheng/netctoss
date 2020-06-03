package utilTest;

import util.JdbcUtil;

public class Test1 {
    public static void main(String[] args) {
        String sql="insert into tuser value(null,?,?,?,?,?)";
        int i = JdbcUtil.excuteUpdate(sql, "namei", "123456", "娜美", "女", 20);
        if (i>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
}
