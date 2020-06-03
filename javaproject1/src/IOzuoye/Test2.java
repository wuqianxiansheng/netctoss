package IOzuoye;

import wuqian.zuoye.Student;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
      /*  FileInputStream fis=new FileInputStream("test.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Goods goods= (Goods) ois.readObject();
        System.out.println("id:"+goods.getId()+"name:"+goods.getName()+"price:"+goods.getPrice());
        ois.close();*/
      FileInputStream fis =new FileInputStream("test.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);
        ArrayList<Goods> list = (ArrayList<Goods>)ois.readObject();
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            System.out.println(goods);
        }

            // Goods goods= (Goods)ois.readObject();
       // System.out.println(goods);
       ois.close();

    }

}
