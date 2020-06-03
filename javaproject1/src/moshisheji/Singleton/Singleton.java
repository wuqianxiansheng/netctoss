package moshisheji.Singleton;
//单例对象能保证在一个 JVM 中，该对象只有一个实例存在
// (懒汉式)
public class Singleton {
    private static Singleton  instance=null;
    private Singleton() {}
    public static Singleton getInstance(){
        if (instance==null){
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

//(饿汉式)直接创建对象
