package FileTest;

import org.junit.Test;

import java.io.*;

public class InputStreamReaderTest {
    /**
     * InputStreamReader : 将字节输入流--》 字符的输入流
     * outputStreamWriter : 将字符的输出流 --》 字节的输出流
     *
     * 编码： 字节 --》 字符
     * 解码: 字符 --》 字节
     */
    @Test
    public void test() throws FileNotFoundException, UnsupportedEncodingException {
        FileInputStream fis = new FileInputStream("hello.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fis);//默认的字符集
        InputStreamReader ins = new InputStreamReader(fis,"UTF-8");//显式指明


    }
}
