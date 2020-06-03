package anntation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD})

public @interface Myannotation2 {
    String value() default "黄石";
}
