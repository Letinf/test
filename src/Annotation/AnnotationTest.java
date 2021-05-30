package Annotation;

import java.util.ArrayList;

@MyAnnocation("hi")   //--》反射所用的，读取注解，再读取里面的成员变量
public class AnnotationTest {

    public static void main(String[] args){
        @SuppressWarnings({"unused","rawtypes"}) //忽略警告
        ArrayList list = new ArrayList();
        System.out.println(10);

    }
}
