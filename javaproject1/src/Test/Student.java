package Test;
/*
创建1个Student类，
里面包括一个int类型的age属性和一个输出学生年龄的study()方法。将注解添加在study()方法上。再通过反射解析study()方法上的注解，
并将注解上的age属性的值赋给Student对象的age,
 */
public class Student {
    public int age;
    @MyAnnotation(value = "wu",age = 20)
    public void study(){
        System.out.println("年龄"+age);

    }
}
