package moshisheji.adapter;

public class Adapter1 extends Source implements Adapter{
    @Override
    public void sleep() {
        System.out.println("睡觉");
       //super.eat();
    }
}
