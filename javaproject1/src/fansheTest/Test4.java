package fansheTest;

import java.lang.reflect.Field;

//获取属性
public class Test4 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("fansheTest.Student");
        Student student = (Student) aClass.newInstance();
        Field field = aClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(student,"王五");
        System.out.println(field.get(student));
    }
}
