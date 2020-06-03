package IOzuoye;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*1.  创建商品类(编号，商品名称，价格)，创建测试类1，
从键盘输入一个商品信息，将信息封装为商品对象，并将商品对象保存到文件中(使用序列化)，再创建测试类2，从文件中读取商品对象，并输出到控制台
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入商品编号：");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("请输入商品名称：");
        String name = sc.nextLine();
        System.out.print("请输入商品价格：");
        int price = sc.nextInt();
        sc.nextLine();
        Goods goods = new Goods(id, name, price);
        FileOutputStream fos = new FileOutputStream("test.txt",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        ArrayList<Goods> list = new ArrayList<>();
        goods.setId(id);
        goods.setName(name);
        goods.setPrice(price);
        list.add(goods);
        oos.writeObject(list);

        oos.close();


    }
}
