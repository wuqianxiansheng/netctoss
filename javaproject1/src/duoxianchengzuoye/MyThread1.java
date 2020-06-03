package duoxianchengzuoye;

/**
 * @author wu
 * @create 2019-09-04   20:09
 */
public class MyThread1 {
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        Thread th1=new Thread(thread1);
        Thread2 thread2=new Thread2();
        Thread th2=new Thread(thread2);
        th1.start();
        th2.start();
    }

}
class Thread1 implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=50;i++){
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=50;i++){
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
