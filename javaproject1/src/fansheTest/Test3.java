package fansheTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//调用方法
public class Test3 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();
        Method eat = studentClass.getMethod("eat");
        eat.invoke(student);


    }
}
