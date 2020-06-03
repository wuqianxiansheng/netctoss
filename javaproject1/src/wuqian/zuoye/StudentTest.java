package wuqian.zuoye;
/*3.	实现List和Map数据的转换。具体要求如下：
功能1：定义方法public void listToMap( ){ }将List中Student元素封装到Map中
        1)	使用构造方法Student(int id,String name,int age,String sex )创建多个学生信息并加入List
        2)	遍历List，输出每个Student信息
        3)	将List中数据放入Map，使用Student的id属性作为key，使用Student对象信息作为value
        4)	遍历Map，输出每个Entry的key和value*/

import java.util.*;

public class StudentTest {






    public static void main(String[] args) {
        Student student1=new Student(1,"张三",20,"男");
        Student student2=new Student(2,"李四",21,"男");
        Student student3=new Student(3,"王五",23,"女");
        Student student4=new Student(4,"陈六",42,"男");
        List<Student> list=new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        Map<Integer,Student> map=new HashMap<>();
        for (Student student:list){
            map.put(student.getId(),student);
        }
        System.out.println(map);



    }
}
