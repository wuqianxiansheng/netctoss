package fansheTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test2 {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        try {
            Constructor<Student> constructor = studentClass.getConstructor(int.class, String.class, String.class);
            try {
                Student student = constructor.newInstance(1, "wu", "男");
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
