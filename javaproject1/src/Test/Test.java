package Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
再通过反射解析study()方法上的注解，并将注解上的age属性的值赋给Student对象的age,
   最后用反射调用study()方法
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Class<Student> studentClass = Student.class;
       Student student = studentClass.newInstance();
        Method[] methods = studentClass.getMethods();
        for (Method md:methods){
            boolean b = md.isAnnotationPresent(MyAnnotation.class);
            if (b){
                int age = md.getAnnotation(MyAnnotation.class).age();
                Field filed = studentClass.getField("age");
                filed.set(student,age);
                md.invoke(student);
            }
        }


    }
}
