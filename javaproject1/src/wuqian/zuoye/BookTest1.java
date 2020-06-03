package wuqian.zuoye;

import sun.net.www.MimeEntry;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BookTest1 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "水浒传", 50, "人民教育出版社");
        Book book2 = new Book(2, "红楼梦", 60, "人民教育出版社");
        // 创建一个map容器
       Map<Integer, Book> map = new HashMap<Integer, Book>();
        map.put(1,book1);
        map.put(2,book2);
      for (Book book:map.values()){
          System.out.println(book);
      }
        // 遍历元素
        //Iterator<Book> iterator = map.keySet().iterator();
        Iterator<Integer> iterator=map.keySet().iterator();
        while(iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("key:" + key + " value:" + map.get(key));
        }
     Set<Map.Entry<Integer,Book>> entryset=map.entrySet();
        Iterator<Map.Entry<Integer, Book>> iterator1 = entryset.iterator();
        while(iterator1.hasNext()){
            Map.Entry<Integer, Book> entry = iterator1.next();
            System.out.println(entry);
        }



    }
}
