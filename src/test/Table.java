package test;

import java.lang.annotation.*;

/**
 * @program: AnnotationDemo
 * @author: yunboy
 * @createDate: 2022/9/30
 */

@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table {
    String value() default "";
}
