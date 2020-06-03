package org.wuqian.wuqian6;


public class Snack extends Monster {
    void HP(){
        if (point<10){
            System.out.println("当前生命值为"+this.point+"实施补血术");
            this.point=point+20;
        }
    }
    @Override
    public  void move(){
        System.out.println("曲线移动");

    }
    @Override
    public void attack(){
        System.out.println(name+"\n生命值："+this.point+"\n攻击力："+atk);
    }
}
