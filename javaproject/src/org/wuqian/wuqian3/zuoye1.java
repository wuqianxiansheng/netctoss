package org.wuqian.wuqian3;

public class zuoye1 {
//5!的计算
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int  s=1;
            for(int j=1;j<=i;j++){
                 s*=j;
            }
            System.out.println(i+"!="+s);
        }
    }
}
