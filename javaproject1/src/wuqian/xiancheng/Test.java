package wuqian.xiancheng;
//1. 编写2个线程，分别打印26个小写字母和26个大写字母
class MyTest implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<26;i++){
            System.out.print((char )('A'+i)+"");
        }
        System.out.println("线性名称："+Thread.currentThread().getName());

    }

}
class MyTest1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 26; i++) {
            System.out.print((char) ('a' + i) + "");
        }
        System.out.println("线性名称：" + Thread.currentThread().getName());

    }
}

public class Test {
    public static void main(String[] args) {
        Runnable test=new MyTest();
        Runnable test1=new MyTest1();
        Thread  th1=new Thread(test,"线程A");
        Thread th2=new Thread(test1);
        th2.setName("线程B");
        th1.start();
        th2.start();
    }






}
