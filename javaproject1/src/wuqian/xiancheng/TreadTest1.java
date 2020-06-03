package wuqian.xiancheng;



class MyTread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + "线程第" + i + "次执行！");
        }
        try {
            join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public MyTread1(String name, int pro) {
        super(name);
        this.setPriority(pro);

    }

}
public class TreadTest1{
    public static void main(String[] args) {
        Thread th1=new MyTread1("线程A",10);
        Thread th2=new MyTread1("线程B",1);
        th1.start();
       th2.start();

    }
}
