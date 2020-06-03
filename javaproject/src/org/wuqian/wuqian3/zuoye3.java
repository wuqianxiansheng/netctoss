package org.wuqian.wuqian3;

public class zuoye3 {
    //在屏幕上打印1-30个数，每7个数换行
    public static void main(String[] args) {

        for (int i=1;i<=30;i++){

            if(i%7==0){
                System.out.println();
            }else{
                System.out.print(i);
            }
        }
    }
}
