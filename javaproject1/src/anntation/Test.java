package anntation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        Class<Teacher> teacherClass = Teacher.class;
        //判断Teacher类上有没有Myannotation注解
        Annotation[] annotations = teacherClass.getAnnotations();
        if (annotations.length == 0) {
            System.out.println("类上没有任何注解");
        } else {
            //判断Teacher类上是否存在指定的注解
            boolean flag = teacherClass.isAnnotationPresent(Myannotation1.class);
            if (flag) {
                Teacher teacher = teacherClass.newInstance();
                //判断哪些方法上有指定的MyAnnotation1注解
                Method[] methods = teacherClass.getMethods();
                for (Method method : methods) {
                    boolean flag1 = method.isAnnotationPresent(Myannotation1.class);
                    if (flag1) {
                        //获取MyAnnotation1注解上的value属性的值
                        String value = method.getAnnotation(Myannotation1.class).value();
                        Field field = teacherClass.getDeclaredField("city");
                        field.setAccessible(true);
                        field.set(teacher, value);
                        //调用方法
                        method.invoke(teacher);
                    }
                }
            }
        }
    }
}
