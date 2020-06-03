package fuxiti3.Student1;

import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import static java.lang.System.exit;

/*
3.	由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；
将输入的学生信息分别封装到一个Student对象中，再将每个Student对象加入到一个集合中，
要求集合中的元素按照年龄大小正序排序；最后遍历集合，将集合中学生信息写入到记事本，每个学生数据占单独一行。（9分）
推荐步骤：
（1）	创建Student类，并指定按照年龄正序排列
（2）	通过控制台输入多个不同Student信息。格式规定为：编号#姓名#年龄
（3）	取出字符串中相应信息放入Student对象，并将Student加入到集合中
（4）	遍历集合的过程中将学生的信息输入到记事本
难点：
（1）	如何指定学生按照年龄正序排列
（2）	如果从字符串“编号#姓名#年龄”中提取学生信息
（3）	放入哪种集合后可以保证学生按照年龄大小正序排列
（4）	如何将集合中学生信息写入记事本，每个学生数据占单独一行

 */
public class Student implements Comparable {
    private Integer id;
    private String name;
    private Integer age;

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return this.age - age;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws Exception {


            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生信息:(学号#姓名#年龄)");
            String s = sc.nextLine();
            if ("exit".equals(s)) {
                exit(0);
            }
            String[] split = s.split("#");
            Student student = new Student(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]));
            TreeSet<Student> tr = new TreeSet<>();
            tr.add(student);
        Iterator iterator = tr.iterator();
        FileWriter fw = new FileWriter(new File("test5"));
        while (iterator.hasNext()) {
            String s1 = iterator.next().toString();
            fw.write(s1);
            fw.write("\r\n");
            fw.close();

        }


    }
}
