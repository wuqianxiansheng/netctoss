package org.wuqian.wuqian_1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的数字：");
        int t = scanner.nextInt();
        boolean flag = false;
        for (int s = 0; s < arr.length; s++) {
            if (s == t) {
                flag = true;

            }


        }
        if (flag) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
