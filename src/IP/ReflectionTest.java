package IP;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Properties;

/**
 * CLASS的实例就对应一个运行时类
 */
public class ReflectionTest {
    @Test
    public void test1() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        Class clazz = Person.class;
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Person p = (Person) constructor.newInstance("tom", 12);
        System.out.println(p.toString());
        //field
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(p, 10);
        System.out.println(p.toString());

        //method
        Method show = clazz.getDeclaredMethod("show",int.class); //参数1，方法名称  参数2：方法的形参列表，注意也是运行时类的形式
        int age1 = (int) show.invoke(p,12);
        System.out.println(age1);
    }


    /**
     * 获取Class的实例的四种方式
     */
    @Test
    public void test2() throws ClassNotFoundException {
        //1:调用运行时类的属性.class
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);

        //2:调用运行时类的对象,getclass()
        Person p = new Person();
        Class clazz2 = p.getClass();
        System.out.println(clazz2);

        //3.调用class的静态方法，forname(string classpath)    -- 更常用
        Class clazz3 = Class.forName("IP.Person");
        System.out.println(clazz3);

        //加载到内存的运行时类，会缓存一段时间。

        //4.使用类的加载器：classloader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("IP.Person");
        System.out.println(clazz4);

        Class c1 = Comparable.class;
        Class c2 = Override.class;
        System.out.println(c1==c2);//这两个实例不一样

    }

    @Test
    public void test3() throws IOException {
        //1
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("src//jdbc1.properties");
        pros.load(fis);
        //2
//        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
//        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc1.properties");
//        pros.load(resourceAsStream);

        String user = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println(user+"  "+password);
    }
}
