package wuqian1;

public class Test1 {

}
 class Printer {
    private int index=1;//设为1，方便计算3的倍数
    //打印数字的方法，每打印两个数字，等待打印一个字母
    public synchronized void print(int i){
        while(index%2==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(""+i);
        index++;
        notifyAll();
    }
    //打印字母，每打印一个字母，等待打印两个数字
    public synchronized void print(char c){
        while(index%2!=0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(""+c);
        index++;
        notifyAll();
    }
}
//打印字母线程
 class LetterPrinter extends Thread {
    private Printer p;
    public LetterPrinter(Printer p){
        this.p=p;
    }

    @Override
    public void run(){
        for(char c='A';c<='Z';c++){
            p.print(c);
        }
    }
}

//打印数字线程
 class NumberPrinter extends Thread {
    private Printer p;
    public NumberPrinter(Printer p){
        this.p=p;
    }
    @Override
    public void run(){
        for(int i=1;i<=52;i++){
            p.print(i);
        }
    }
}
//测试类
class Test {
    public static void main(String[] args) {
        Printer p=new Printer();     //创建打印机对象
        Thread t1=new NumberPrinter(p);  //创建线程对象
        Thread t2=new LetterPrinter(p); //创建线程对象
        t1.start();  //启动线程
        t2.start(); //启动线程
    }
}

