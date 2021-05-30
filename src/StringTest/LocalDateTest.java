package StringTest;

import org.junit.Test;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class LocalDateTest {
    @Test
    public void test(){
        //now()

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of()
        LocalDateTime c = LocalDateTime.of(2020, 10, 5, 12, 45, 55);
        System.out.println(c);

        //getxxx()
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getMonth());
        //with设置相关的属性
        LocalDateTime l1 = localDateTime.withDayOfMonth(22);
        System.out.println(l1);
        //plusxxx
        LocalDateTime l2 = localDateTime.plusDays(5);
        System.out.println(l2);

        //minusxxx
        LocalDateTime l3 = localDateTime.minusDays(4);
        System.out.println(l3);

    }

    @Test
    public void test1(){
        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println(instant.toEpochMilli());
    }

    @Test
    public void test2(){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String str1 = f.format(LocalDateTime.now());
        System.out.println(str1);

        TemporalAccessor s = f.parse("2021-05-06 09:21:46");
        System.out.println(s);
    }
}
