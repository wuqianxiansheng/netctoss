package fuxiti2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*	 自定义一个注解MyAnnotation,包含属性String类型的value和int类型的count ，
        使它能用来修饰一个类Student及类里的成员方法work和sleep。再用反射获取注解上的属性值，并输出到控制台*/
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "工作";

    int count();
}
@MyAnnotation(value="工作",count = 1)
class Student1 {
    private String work;
@MyAnnotation(value="工作" ,count = 2)
    public void work() {
        System.out.println("我正在" + work);
    }

    public void sleep() {
        System.out.println("我正在睡觉");
    }
}

class Test {
    public static void main(String[] args) throws Exception{
        Class<Student1> student1Class = Student1.class;
        Student1 stu = student1Class.newInstance();
        Method[] methods = student1Class.getMethods();
        for (Method method:methods){
            if (method.isAnnotationPresent(MyAnnotation.class)){
                String value = method.getAnnotation(MyAnnotation.class).value();
                Field work = student1Class.getDeclaredField("work");
                work.setAccessible(true);
                work.set(stu,value);
                method.invoke(stu);
            }
        }
    }
}
