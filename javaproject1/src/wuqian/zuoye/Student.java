package wuqian.zuoye;
/*3.	实现List和Map数据的转换。具体要求如下：
功能1：定义方法public void listToMap( ){ }将List中Student元素封装到Map中
        1)	使用构造方法Student(int id,String name,int age,String sex )创建多个学生信息并加入List
        2)	遍历List，输出每个Student信息
        3)	将List中数据放入Map，使用Student的id属性作为key，使用Student对象信息作为value
        4)	遍历Map，输出每个Entry的key和value*/


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private int id;
    private String name;
    private int age;
    private String sex;

    public Student(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }




}
