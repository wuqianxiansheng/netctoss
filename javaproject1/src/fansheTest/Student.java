package fansheTest;

public class Student {
    private int id;
    private String name;
    private  String sex;

    public Student() {
        System.out.println("无参构造器");
    }

    public Student(int id, String name, String sex) {
        System.out.println("有参构造器");
        this.id = id;
        this.name = name;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public  void  eat(){
        System.out.println("吃东西");
    }
    public  void  age(int age){
        System.out.println("年龄："+age);
    }
    private void  sleep(int  a,String b){

        System.out.println("晚上也要睡觉"+a+"..."+b);
    }
}
