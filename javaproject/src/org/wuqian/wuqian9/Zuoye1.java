package org.wuqian.wuqian9;

import java.util.Scanner;

//1.	验证键盘输入的用户名不能为空，长度大于6，不能有数字
public class Zuoye1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String st=sc.nextLine();
        if (st==null){
            System.out.println("用户名不能为空");
        }else if (st.length()<=6){
            System.out.println("长度需要大于6");
        }else{
            for (int i=0;i<st.length();i++){
                char ch = st.charAt(i);
                if(ch <=57 && ch >=48){
                    System.out.println("用户名不能有数字");
                    //break;//退出for循环
                    return;//退出main方法
                }


            }
        }
        System.out.println(sc);
    }

}
