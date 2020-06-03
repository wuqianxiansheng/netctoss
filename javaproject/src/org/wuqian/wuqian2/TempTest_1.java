package org.wuqian.wuqian2;

public class TempTest_1 {
    private void test1(A a){
        a.age=20;
        System.out.println("test方法中的age="+a.age);

    }
    public static void main(String[] args){
        TempTest_1 t=new TempTest_1();
        A a=new A ();
        a.age=10;
        t.test1(a);
        System.out.println(" main方法中的age= " +a.age );
    }
}
class A{
    public int age=0;
}

