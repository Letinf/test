package StringTest;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.Callable;

public class CalendarTeaet {
    @Test
    public void test(){
        //1、实例化
        Calendar calendar = new GregorianCalendar();
        //2、常用方法
        //get
        //set
        //add
        //gettime
        //settime
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        int s = calendar.get(5);
        System.out.println(s);

        calendar.set(Calendar.DAY_OF_MONTH,22);
        s = calendar.get(5);
        System.out.println(s);

        //calendar.add();
    }
}
