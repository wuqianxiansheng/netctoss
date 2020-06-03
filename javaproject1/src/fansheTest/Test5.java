package fansheTest;

import java.lang.reflect.Method;

//调用私有有参数的方法；
public class Test5 {
    public static void main(String[] args)throws Exception {
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();
        Method sleep = studentClass.getDeclaredMethod("sleep", int.class, String.class);
        sleep.setAccessible(true);
        sleep.invoke(student,1,"吴骞");


    }
}
