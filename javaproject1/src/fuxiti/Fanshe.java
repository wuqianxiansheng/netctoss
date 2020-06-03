package fuxiti;

import java.lang.reflect.Constructor;
import java.util.Scanner;

/*
3.使用反射机制完成学生对象的创建并输出学生信息。
要求：
（1）定义一个学生类Student，其中包含姓名(String)、年龄(int)、成绩(float)的属性。
（2）编写带参与无参构造方法。
（3）重写父类的toString()方法用于输出学生的信息。
 */
public class Fanshe {
}
class Student{
    private String name;
    private int age;
    private  int  grade;

    public Student() {

    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
/*
4）编写测试类TestStudent，从键盘录入学生的信息格式为(姓名:年龄:成绩)一次性录入使用“:”分隔，举例(mary:20:90)。
（5）使用String类的split方法按照“:”进行分隔。
（6）调用Constructor的newInstance()方法并用分隔后的信息初始化学生对象。
（7）调用重写父类的toString()方法将学生信息进入输出显示。
 */
class  TestStudent{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("姓名"+":"+"年龄"+":"+"成绩");
         String name=sc.nextLine();
         int age=sc.nextInt();
         sc.nextLine();
         int grade=sc.nextInt();
         sc.nextLine();
        Class<Student> studentClass = Student.class;
        Constructor<Student> constructor = studentClass.getConstructor(String.class, int.class, int.class);

        Student student = constructor.newInstance(name, age,grade);
        System.out.println(student.toString());


    }
}
