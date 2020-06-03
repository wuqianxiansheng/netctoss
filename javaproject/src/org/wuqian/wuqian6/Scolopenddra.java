package org.wuqian.wuqian6;

public class Scolopenddra  extends Monster{
    @Override
    public  void move(){
        System.out.println("飞行");
    }
    @Override
    public void attack(){
        System.out.println(name+"\n生命值："+this.point+"\n攻击力："+atk);
    }
}
