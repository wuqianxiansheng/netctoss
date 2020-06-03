package Test;
/*
1.	写出饿汉式单例模式、懒汉式单例模式、多线程情况下懒汉式判断单例模式的示例代码。
 */
public class Test1 {



}
class Singleton{
    private static Singleton instance=null;
    private  Singleton(){}
    public static Singleton getInstance(){
        if (instance==null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
