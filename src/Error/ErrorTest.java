package Error;

import Proxy.InnerClassTest;
import org.junit.Test;

import javax.management.relation.RoleInfoNotFoundException;
import javax.naming.NameNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Target;
import java.util.Date;

public class ErrorTest {
    @Test
    public void test3() {
        Object obj = new Date();
        String str = (String) obj;
        
    }

    @Test
    public void test4() {
        String str = "abc";
        Integer num = Integer.parseInt(str);
    }
    @Test
    public void test5() {
        try {
            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);
            int data = fis.read();
            while (data != -1) {
                System.out.println((char) data);
                data = fis.read();
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1(){
        String str = "sd";
        try {
            int num = Integer.parseInt(str
            );
            System.out.println("hello");

        }
        catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }catch (Exception e) {
            System.out.println("父异常");
        }

        System.out.println("还会执行吗");
    }
    @Test
    public void test2(){
        System.out.println("hot-fix");
    }


}

