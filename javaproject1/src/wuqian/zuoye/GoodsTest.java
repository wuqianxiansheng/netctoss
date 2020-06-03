package wuqian.zuoye;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class GoodsTest {
    public static void main(String[] args) {
        Goods goods1=new Goods(1,"茶杯",25,"黄石");
        Goods goods2=new Goods(1,"茶杯",25,"黄石");
        Goods goods3=new Goods(3,"电脑",25000,"武汉");
        Goods goods4=new Goods(4,"手机",2500,"汉川");
        HashSet<Goods> hashSet=new HashSet<>();
        hashSet.add(goods1);
        hashSet.add(goods2);
        hashSet.add(goods3);
        hashSet.add(goods4);
        Iterator<Goods> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            Goods next = iterator.next();
            System.out.println(next);

        }



    }
}
