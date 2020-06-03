package org.wuqian.wuqian8;

import java.util.Scanner;

public class Test {
    public static Food makePizza(int i) {
        Food f = null;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        int size = 0;
        int price = 0;
        switch (i) {
            case 1:
                System.out.println("请输入培根克数：");
                int gram = sc.nextInt();
                System.out.println("请输比萨大小：");
                size = sc.nextInt();
                System.out.println("请输入比萨价格：");
                price = sc.nextInt();
                f = new Pei("培根比萨", price, size, gram);
                break;
            case 2:
                System.out.println("请输入配料信息：");
                String mixture = sc.next();
                System.out.println("请输比萨大小：");
                size = sc.nextInt();

                System.out.println("请输入比萨价格：");
                price = sc.nextInt();
                f = new Hai("海鲜比萨", price
, size, mixture);

        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择想要制作的比萨(1.培根比萨 2.海鲜比萨)：");
        int i = sc.nextInt();
        Food f = makePizza(i);
        f.show();
    }

}
