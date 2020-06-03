package fuxiti3;



/*
2.	编写多线程程序，模拟多个人通过一个山洞的模拟。这个山洞每次只能通过一个人，
每个人通过山洞的时间为5秒，有10个人同时准备过此山洞，显示每次通过山洞人的姓名和顺序。
 */
public class MyThread implements Runnable{
    @Override
    public void run()  {
        synchronized (this){
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread my=new MyThread();
        Thread p1 = new Thread(my,"p1");
        Thread p2 = new Thread(my,"p2");
        Thread p3 = new Thread(my,"p3");
        Thread p4 = new Thread(my,"p4");
        Thread p5 = new Thread(my,"p5");
        Thread p6 = new Thread(my,"p6");
        Thread p7 = new Thread(my,"p7");
        Thread p8 = new Thread(my,"p8");
        Thread p9 = new Thread(my,"p9");
        Thread p10 = new Thread(my,"p10");
        //启动十个线程
        p1.start();        p2.start();
        p3.start();        p4.start();
        p5.start();        p6.start();
        p7.start();        p8.start();
        p9.start();        p10.start();

    }
}
