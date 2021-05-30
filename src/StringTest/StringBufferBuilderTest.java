package StringTest;


import org.junit.Test;

/**
 * string 不可变
 * stringBuffer : 可变，线程安全，效率低
 * StringBuilder : 可变，线程不安全，效率高
 * 都是用char[]数组存储
 *
 *
 * 源码分析：
 * 自己去看
 */
public class StringBufferBuilderTest {
    @Test
    public void test1(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.setCharAt(0,'m');
        System.out.println(s1);

        StringBuffer s2 = new StringBuffer();
        System.out.println(s2.length());//0

        //扩容
        s2.append("dafcasfsf");
        s2.delete(1, 3);
        s2.replace(2,4,"tyt");
        s2.insert(2, false);
        s2.reverse();
        String s3 = s2.substring(1, 3);
        System.out.println(s3);
        String.valueOf(0);



    }

}
