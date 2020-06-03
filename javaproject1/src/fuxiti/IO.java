package fuxiti;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/*
2.使用IO包中的类读取D盘上exam.txt文本文件的内容，每次读取一行内容，将每行内容放入List的泛型集合中，
并将集合中的内容使用增强for循环进行输出显示。
 */
public class IO {
    public static void main(String[] args)  throws  Exception{
        FileReader fr=new FileReader("test4.txt");
        BufferedReader br=new BufferedReader(fr);
        ArrayList<String> list=new ArrayList<>();
             String   s=null;
        while ((s=br.readLine())!=null){
            list.add(s);
        }
        for (String li:list){
            System.out.println(li);
        }
        br.close();




    }
}
