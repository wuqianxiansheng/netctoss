package org.wuqian.wuqian4;

//1. 定义一个方法，在方法中通过可变参数来计算任意多个整数的乘积
public class zuoye6 {
    public static void main(String[] args) {
        int t = chengji(2, 3, 2);
        System.out.println("成绩：" + t);
    }

    public static int chengji(int a, int b, int... arr) {
        int s = a * b;
        for (int i = 0; i < arr.length; i++) {
            s *= arr[i];
        }
        return s;
    }

}

