package fuxiti3;

/*
1.	编写递归算法程序：一列数的规则如下: 0、1、1、2、3、5、8、13、21、34...... 求数列的第40位数是多少。
 */
public class digui {
    public static int diDui(int i) {

        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        return diDui(i - 1) + diDui(i-2);
    }

    public static void main(String[] args) {
        int i = diDui(40);
        System.out.println(i);
    }
}
