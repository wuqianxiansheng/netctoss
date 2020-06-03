package wuqian.xiancheng;

import java.util.concurrent.Callable;

//2. 设计一个多线程的程序如下：设计一个火车售票模拟程序。假如火车站要有100张火车票要卖出，
// 现在有5个窗口同时售票，用5个线程模拟这5个窗口的售票情况。
class Mysell implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票，售号" + ticket);
                    ticket--;

                } else {
                    break;
                }
            }
        }
    }
}

    public class TreadTest {
        public static void main(String[] args) {
            Mysell test1 = new Mysell();
            Thread th1 = new Thread(test1, "窗口1");
            Thread th2 = new Thread(test1, "窗口2");
            Thread th3 = new Thread(test1, "窗口3");
            Thread th4 = new Thread(test1, "窗口4");
            Thread th5 = new Thread(test1, "窗口5");
            th1.start();
            th2.start();
            th3.start();
            th4.start();
            th5.start();

        }
    }
