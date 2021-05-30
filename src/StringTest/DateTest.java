package StringTest;

import org.junit.Test;

import javax.swing.*;
import java.net.StandardSocketOptions;
import java.util.Calendar;
import java.util.Date;

/**
 * Date类
 */

public class DateTest {
    @Test
    public void test(){
        System.out.println(System.currentTimeMillis());//返回值为long 毫秒

    }

    @Test
    public void test1(){
        //构造器1：Date()
        Date date1 = new Date();
        System.out.println(date1.toString());//获取具体的时间
        System.out.println(date1.getTime()); //获取时间戳

        Date d1 = new Date(1620272551898L);
        System.out.println(d1.toString());

        java.sql.Date d2 = new java.sql.Date(1620272551898L);
        System.out.println(d2);
        }
    }

