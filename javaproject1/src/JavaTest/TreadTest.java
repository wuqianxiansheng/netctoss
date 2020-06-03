package JavaTest;
//2.	创建2个线程，线程1输出26个大写字母，线程2输出26个小写字母，要求交替输出，即AaBb....Zz(12分)
public class TreadTest {
    public static void main(String[] args) {
        Print pt=new Print();
        RunnableBig big=new RunnableBig(pt);
        RunnableSmall small=new RunnableSmall(pt);
        Thread th1=new Thread(big);
        Thread th2=new Thread(small);
        th2.start();
        th1.start();

    }




}
class Print{
    public void print(char c) {
        synchronized (this){
            System.out.print(c);
            notify();
            if (c!='z'){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
class RunnableBig implements Runnable{
    private  Print pt;

    public RunnableBig(Print pt) {
        this.pt = pt;
    }

    @Override
    public void run() {
        for (char c='A';c<='Z';c++){
            pt.print(c);

    }

}

}
class RunnableSmall implements Runnable{
    private Print pt;

    public RunnableSmall(Print pt) {
        this.pt = pt;
    }

    @Override
    public void run() {
        for (char c='a';c<='z';c++){
            pt.print(c);

        }

    }
}
