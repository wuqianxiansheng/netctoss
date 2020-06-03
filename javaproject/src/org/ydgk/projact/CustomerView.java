package org.ydgk.projact;

import java.util.Scanner;

public class CustomerView extends Customer{
    public CustomerView(String name, char gender, int age, String phone, String email) {
        super(name, gender, age, phone, email);
    }


    public void enterMainMenu(){
        System.out.println("----------客户信息管理软件---------");
        System.out.println("          1\t添加客户");
        System.out.println("          2\t修改客户");
        System.out.println("          3\t删除客户");
        System.out.println("          4\t客户列表");
        System.out.println("          5\t退\t\t出");
        System.out.println("          请选择1——5");

        int i=0;
        Scanner scanner=new Scanner(System.in);
        i=scanner.nextInt();
        switch(i){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;

            case 4:

            case 5:

        }
    }
    private void addNewCustomer(){

        System.out.println("--------添加客户--------");
        Scanner scanner =new Scanner(System.in);
        System.out.print("姓名：");






    }


    public static void main(String[] args) {
        



    }

}

