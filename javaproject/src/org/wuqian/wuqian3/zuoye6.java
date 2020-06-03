package org.wuqian.wuqian3;
//九九乘法口诀表

public class zuoye6 {

    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}
