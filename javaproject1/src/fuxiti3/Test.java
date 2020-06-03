package fuxiti3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


class Student implements Comparable<Student> {
    private Integer num;
    private String name;
    private Integer age;

    public Student(Integer num, String name, Integer age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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
    public int compareTo(Student stu) {
        return this.age - stu.age;
    }

    @Override
    public String toString() {
        return "Student1 [age=" + age + ", name=" + name +
        ", num=" + num + "]";
        }
        }

public class Test {
    public static void main(String[] args) {
        Set<Student> stuSet = saveStudentInfo();
        outputInfo(stuSet);
    }

    private static Set<Student> saveStudentInfo() {
        Scanner input = new Scanner(System.in);
        // 保存学生信息的TreeSet集合对象
        Set<Student> stuSet = new TreeSet<Student>();
        while (true) {
            // 输入提示
            System.out.println("请输入学生信息:(学号#姓名#年龄)");
            String inputData = input.nextLine();
            // 判断是否退出 inputData.equals("exit")
            if ("exit".equals(inputData)) {
                break;
            }
            // 将用户输入的学生信息分割为String[]
            String[] info = inputData.split("#");
            // 将输入信息封装到Student对象中
          Student stu =
                    new Student(Integer.parseInt(info[0]), info[1],
                            Integer.parseInt(info[2]));
            // 将学生对象加入集合
            stuSet.add(stu);
        }
        return stuSet;
    }

    private static void outputInfo(Set<Student> stuSet) {
        File file = new File("e:/student.txt");
        // 创建文件输出流对象
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            Iterator<Student> it = stuSet.iterator();
            while (it.hasNext()) {
                String info = it.next().toString();
                // 将info字符串，写入记事本
                fw.write(info);
                // 写入换行符

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
