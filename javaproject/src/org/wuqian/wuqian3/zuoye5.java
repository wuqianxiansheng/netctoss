package org.wuqian.wuqian3;
//打印10以内所有的偶数

public class zuoye5 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
