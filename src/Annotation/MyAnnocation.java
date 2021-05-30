package Annotation;


import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * 1、声明为@interface
 * 2、内部定义成员，通常用value
 * 3、默认值为default定义
 *
 */


//@Repeatable(MyAnnocation.class)
public @interface MyAnnocation {
    String value() default "hello"; //成员变量。不是方法

}
