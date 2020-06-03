package wuqian.zuoye;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*功能2：定义方法public void mapToList( ){ }将Map中Student映射信息封装到List
1)	创建实体类StudentEntry，可以存储Map中每个Entry的信息
2)	使用构造方法Student(int id,String name,int age,String sex )创建多个学生信息，并使用Student的id属性作为key，存入Map
3)	创建List对象，每个元素类型是StudentEntry
4)	将Map中每个Entry信息放入List对象
*/
public class StudentEntry {
    private int key;//关键字
    private Student stu;//学生

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Student getStu(){
            return stu;
}

    public void setStu(Student stu) {
        this.stu = stu;
    }



    public void mapToList() {
        //1.创建多个学生信息
        Student stu1 = new Student(110, "小明", 23,"男");
        Student stu2 = new Student(111, "大刚", 21, "女");
        Student stu3 = new Student(112, "小白", 12, "男");
        //2.使用Student的id属性作为key，存入Map
        Map<Integer, Student> map = new HashMap<Integer, Student>();
        map.put(stu1.getId(), stu1);

        map.put(stu2.getId(), stu2);
        map.put(stu2.getId(), stu3);
        //3.创建List对象，每个元素类型是StudentEntry
        List<StudentEntry> list = new ArrayList<StudentEntry>();
        //4.将Map对象转化为List集合
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            StudentEntry studentEntry = new StudentEntry();
            // 将map中的一个映射关系，封装为一个studentEntry对象
            studentEntry.setKey(entry.getKey());
            studentEntry.setStu(entry.getValue());
            // 将studentEntry对象List集合
            list.add(studentEntry);
        }
        //5.遍历Map
        for (StudentEntry se : list) {
            System.out.println(se.getKey() + "\t" + se.getStu());
        }
    }
    /*public static void main(String[] args) {

        Student1 student1=new Student1(1,"张三",20,"男");
        Student1 student2=new Student1(2,"李四",21,"男");
        Student1 student3=new Student1(3,"王五",23,"女");
        Student1 student4=new Student1(4,"陈六",42,"男");
        Map<Integer,Student1> map =new HashMap<>();
        map.put(1,student1);
        map.put(2,student2);
        map.put(3,student3);
        map.put(4,student4);
        List<StudentEntry> li=new ArrayList<>();
        li.add(map.get());




    }*/
}
