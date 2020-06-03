package anntation;
@MyAnntation(age=10)
public class Teacher {
    private String city;
    private int age;
    @MyAnntation(value="上海",age=20)
    public  void  sleep(){
        System.out.println("年龄："+age+","+city+"的老师在睡觉");
    }
    @MyAnntation(age=30)
    public  void  eat(){
        System.out.println("年龄："+age+","+city+"的老师在吃东西");
    }
}
