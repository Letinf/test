package StringTest;

import org.junit.Test;
import org.w3c.dom.DOMImplementation;

import java.lang.ref.SoftReference;
import java.util.Locale;

public class StringTest {
    @Test
    public void test1(){
        String s1 = "hElloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.isEmpty());
        String s2 = s1.toUpperCase();
        System.out.println(s2);
        String s = " jhj uiouo E ";
        String s3 = s.trim();
        System.out.println(s3);


    }

    @Test
    public void test2(){
        String s1 = "HELLOworld";
        String s2 = "HElloWorLD";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String s3 = "asd";
        System.out.println(s3.concat(s1));
        int a = s1.compareTo(s2);
        System.out.println(a);
        String s4 = s3.substring(1);
        System.out.println(s4);
        String s5 = s1.substring(2, 5);
        System.out.println(s5);
    }

    @Test
    public void test3(){
        String s1 = "helloworld";
        System.out.println(s1.endsWith("ld"));
        System.out.println(s1.startsWith("He"));
        System.out.println(s1.startsWith("ll",3));

        System.out.println(s1.contains("he"));

        System.out.println(s1.indexOf("lo"));
        System.out.println(s1.indexOf("lo",5)); //从索引号为5开始找

        System.out.println(s1.lastIndexOf("rl"));
    }
    @Test
    public void test4(){
        String s1 = "helloworld";
        String s2 = s1.replace('l', '*');
        System.out.println(s2);
        String s = "23131hdfgakjfghkj5654dsd34cd";
        System.out.println(s.replaceAll("\\d+","*"));

        s = "1234687";
        System.out.println(s.matches("\\d+"));
        s = "hello|world|java";
        String[] strs =s.split("\\|");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

    }
}
