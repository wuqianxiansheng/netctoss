package anntation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        Class<Teacher> teacherClass = Teacher.class;
//判断该类有没有指定注解
        boolean b = teacherClass.isAnnotationPresent(MyAnntation.class);
        if (b) {
            //创建该类对象
            Teacher teacher = teacherClass.newInstance();
            Method[] methods = teacherClass.getDeclaredMethods();
            for (Method method : methods) {
                boolean flag = method.isAnnotationPresent(MyAnntation.class);
                if (flag) {
                    String value = method.getAnnotation(MyAnntation.class).value();
                    Field field = teacherClass.getDeclaredField("city");
                    //int age = method.getAnnotation(MyAnntation.class).age();
                    //Field f = teacherClass.getDeclaredField("age");
                    field.setAccessible(true);
                    field.set(teacher, value);
                    //field.set(teacher, age);
                    method.invoke(teacher);
                }
            }
        }
    }
}