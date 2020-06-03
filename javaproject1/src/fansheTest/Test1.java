package fansheTest;

public class Test1 {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        try {
            Student student = studentClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
