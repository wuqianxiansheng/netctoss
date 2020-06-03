package duoxianchengzuoye;
/*3. 编写两个线程,一个线程打印1-52的整数，另一个线程打印字母A-Z。打印顺序为12A34B56C….5152Z。
即按照整数和字母的顺序从小到大打印，并且每打印两个整数后，打印一个字母，交替循环打印，直到打印到整数52和字母Z结束。
要求：
1)	编写打印类Printer，声明私有属性index，初始值为1，用来表示是第几次打印。
2)	在打印类Printer中编写打印数字的方法print(int i)，3的倍数就使用wait()方法等待，否则就输出i，使用notifyAll()进行唤醒其它线程。
3)	在打印类Printer中编写打印字母的方法print(char c)，不是3的倍数就等待，否则就打印输出字母c，使用notifyAll()进行唤醒其它线程。
4)	编写打印数字的线程NumberPrinter继承Thread类，声明私有属性private Printer p;在构造方法中进行赋值，实现父类的run方法，调用Printer类中的输出数字的方法。
5)	编写打印字母的线程LetterPrinter继承Thread类，声明私有属性private Printer p;在构造方法中进行赋值，实现父类的run方法，调用Printer类中的输出字母的方法。
6)	编写测试类Test，创建打印类对象，创建两个线程类对象，启动线程。
*/

public class Printer {
    private int index = 1;

    public synchronized void print(int i) {
       while (index % 3 == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.print(i);
            notifyAll();
            index++;


    }

    public synchronized void print(char c) {
        while (index % 3 != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
            System.out.print(c);
            notifyAll();
            index++;



    }
}

class NumberPrinter extends Thread {
    private Printer p;

    public NumberPrinter(Printer p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 52; i++) {
            p.print(i);
        }
    }
}

class LetterPrinter extends Thread {
    private Printer p;

    public LetterPrinter(Printer p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            p.print(c);
        }
    }
}

class Test {
    public static void main(String[] args) {
        Printer p = new Printer();
        NumberPrinter np = new NumberPrinter(p);
        LetterPrinter lp = new LetterPrinter(p);
        //Thread th1=new Thread(np);
        // Thread th2=new Thread(lp);
        //th1.start();
        np.start();
        lp.start();
    }


}