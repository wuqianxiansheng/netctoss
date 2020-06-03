package wuqian.zuoye;

import java.util.*;

public class BookTest {
    public static void main(String[] args) {
        Book book1=new Book(1,"水浒传",50,"人民教育出版社");
        Book book2=new Book(2,"红楼梦",60,"人民教育出版社");
        ArrayList<Book> list=new ArrayList<>();
        list.add(book1);
        list.add(book2);
       /* for (int i=0;i<list.size();i++){
            Book book = list.get(i);
            System.out.println(book);
        }*/
// 获取容器的迭代器对象
        Iterator iterator = list.iterator();
        // 迭代器while循环的形式的使用
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Map<Integer,Book> map=new HashMap<>();
        map.put(book1.getId(),book1);
        map.put(book2.getId(),book2);
      for (Map.Entry<Integer,Book> b:map.entrySet()){
          System.out.println("关键字："+b.getKey()+"------- "+  "值："+b.getValue());
      }




    }
}
