package org.wuqian.wuqian3;
//打印1000以内的所有素数

public class zuoye4 {
    public static void main(String[] args) {

        boolean flag = true;
        for (int i = 2; i <= 1000; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("i是素数" + i);
            }

        }

    }
}
