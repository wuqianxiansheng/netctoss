package fuxiti;

public class SellWindow implements Runnable {
    //总票数
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票，票号：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

/**
 * 测试类
 */
class SaleTicketTest {
    public static void main(String[] args) {
        // 创建任务类对象
        SellWindow win = new SellWindow();
        // 启动5个线程
        Thread t1 = new Thread(win, "窗口1");
        Thread t2 = new Thread(win, "窗口2");
        Thread t3 = new Thread(win, "窗口3");
        Thread t4 = new Thread(win, "窗口4");
        Thread t5 = new Thread(win, "窗口5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
