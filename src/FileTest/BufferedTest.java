package FileTest;

import org.junit.Test;

import java.io.*;

public class BufferedTest {
    @Test
    public void test1()  {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcfile = new File("");
            File desfile = new File("");

            fis = new FileInputStream(srcfile);
            fos = new FileOutputStream(desfile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //字节流
            byte[] buffer = new byte[10];
            int lne;
            while ((lne = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, lne);

                //bos.flush();//刷新缓冲区
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos!=null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis!=null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            //在关闭外层流的同时，内层流也会自动关闭，所以可以省略
//            fos.close();
//            fis.close();
        }


    }
    @Test
    public void test2()  {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("hello")));

            bufferedWriter = new BufferedWriter(new FileWriter(new File("hello2")));
            //读写操作，方式一，存到数组
            char[] chars = new char[1024];
            int len;
            while ((len = bufferedReader.read(chars)) != -1) {
                bufferedWriter.write(chars,0,len);
                //bufferedWriter.flush();
            }

            //方式二：
            String data;
            while ((data = bufferedReader.readLine())!=null){
                bufferedWriter.write(data);//不包含换行符
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bufferedReader!=null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
