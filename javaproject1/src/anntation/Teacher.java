package anntation;
@Myannotation1(value = "汉川",age = 20)
public class Teacher {
    private  String  city;
    public void study(){
        System.out.println("老师学习");
    }
    @Myannotation1(value="上海",age=10)
    public void eat(){
        System.out.println( this.city+"的老师在吃饭");
    }
    @Myannotation1(age=30)
    public void sleep(){
        System.out.println( this.city+"的老师在睡觉");
    }
}
