package org.wuqian.wuqian3;
//写一个程序，打印出从1加到100的和
public class zuoye8 {
    public static void main(String[] args) {
        int i; int sum=0;

        for (i=1;i<=100;i++){

            sum=i+sum;

        }
        System.out.println("sum="+sum);
    }
}
