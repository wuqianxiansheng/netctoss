package duoxianchengzuoye;

/**
 * @author wu
 * @create 2019-09-04   20:21
 */
/*
编写一个继承Thread类的方式实现多线程的程序。该类MyThread有两个属性，一个字符串WhoAmI代表线程名，
一个整数delay代表该线程随机要休眠的时间。构造有参的构造器，线程执行时，显示线程名和要休眠时间。
另外，定义一个测试类TestThread，创建三个线程对象以展示执行情况。
 */
public class MyThread extends Thread {
    private String WhoAmI;
    private int delay;

    public MyThread(String whoAmI, int delay) {
        WhoAmI = whoAmI;
        this.delay = delay;
    }


    @Override
    public  void run() {
            for (int i = 1; i <= 10; i++) {
                try {
                    sleep(delay);
                    System.out.println(this.WhoAmI + ":" + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}

class TestThread {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("线程A", 100);
        myThread1.start();
        MyThread myThread2 = new MyThread("线程B", 100);
        myThread2.start();
        MyThread myThread3 = new MyThread("线程C", 100);
        myThread3.start();
    }
}
