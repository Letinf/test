package GenericTest;

import org.junit.Test;

import javax.management.ObjectName;
import java.io.File;
import java.util.*;

public class DAOTest {
    @Test
    public void test(){
        CustomerDAO dao = new CustomerDAO();
        dao.add(new Customer());
        List<Customer> list = dao.getAllIndex(10);

        StudentDAO studentDAO = new StudentDAO();
        studentDAO.add(new Student());

    }

    /**
     * G<A>和 G<B> 没有关系，两者共同的父类是：G<?>
     */
    @Test
    public void test1(){

        List<Object> list1 = null;
        List<Object> list2 = null;

        List<?> list = null;
        list = list1;
        list = list2;
    }

    @Test
    public void test2(){
        File file = new File("hello.txt");
        System.out.println(file);
    }

}
