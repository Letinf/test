package StringTest;

import org.junit.Test;

import java.lang.ref.SoftReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest {
    @Test
    public void test() throws ParseException {
        //实例化对象
        SimpleDateFormat sp = new SimpleDateFormat();
        //格式化：日期--》字符串
        Date d = new Date();
        String format= sp.format(d);
        System.out.println(format);

        String str = "2019-08-09 04:12:45";
        java.sql.Date s = (java.sql.Date) sp.parse(str);
        SimpleDateFormat sd1 =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //指定
        String f1 = sd1.format(str);

        System.out.println(f1);
    }

}
