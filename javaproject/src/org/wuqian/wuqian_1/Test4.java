package org.wuqian.wuqian_1;

import java.util.Scanner;

/*1.	编写程序接收用户输入分数信息，如果分数在0—100之间，输出成绩。如果成绩不在该范围内，抛出异常信息，提示分数必须在0—100之间。
要求：使用自定义异常实现
*/
public class Test4 {
    public static void main(String[] args) {
Student student=new Student();
student.getScore();
Double d=new Double("12.5");
        double v = d.doubleValue();
    }




    }


class NumOutOfBoundsException extends Exception{
    public NumOutOfBoundsException() {}
    public NumOutOfBoundsException(String msg){

    }
}

class Student {
    int score;

    public void getScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数");

        if (score <= 100 & score >= 0) {
            System.out.println(score);

        } else {

            try {
                throw new NumOutOfBoundsException("分数必须在0—100之间");

            } catch (NumOutOfBoundsException e) {
                System.out.println("msg:" + e.getMessage());


            }
        }
    }
}


