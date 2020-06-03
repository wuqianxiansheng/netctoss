package Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
2.	自定义一个注解MyAnnotation，里面包括1个String类型的value属性，一个int类型有默认值的age属性，再创建1个Student类，
里面包括一个int类型的age属性和一个输出学生年龄的study()方法。将注解添加在study()方法上。再通过反射解析study()方法上的注解，
并将注解上的age属性的值赋给Student对象的age,
   最后用反射调用study()方法

 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
    int age() default 20;
}
