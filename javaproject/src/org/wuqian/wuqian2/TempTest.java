package org.wuqian.wuqian2;

public class TempTest {
    private void test1(int a){
        a=5;
        System.out.println("test方法的a= " + a);
    }
    public static void main(String[] args){
        TempTest t = new TempTest();
        int a=3;
        t.test1(a);
        System.out.println("main方法中的a="+a );
    }
}
