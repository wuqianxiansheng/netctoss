package fuxiti;

import sun.security.krb5.internal.Ticket;

public class ThreadTest extends Thread {
    private int ticket = 100;

    @Override
    public void run() {
        while(true){
            if (ticket>0){
                synchronized (this){
                    System.out.println(Thread.currentThread().getName()+"票号"+ticket);
                    ticket--;
                }
            }
        }
    }
}
class MyThread{
    public static void main(String[] args) {
      Thread th1=new ThreadTest();
       Thread t1=new Thread(th1);
        Thread t2=new Thread(th1);
        Thread t3=new Thread(th1);
        Thread t4=new Thread(th1);
        Thread t5=new Thread(th1);
     /*   ThreadTest th1=new ThreadTest();
        ThreadTest th2=new ThreadTest();
        ThreadTest th3=new ThreadTest();
        ThreadTest th4=new ThreadTest();
        ThreadTest th5=new ThreadTest();*/


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();






    }
}
