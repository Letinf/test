package FileTest;

import org.junit.Test;

import java.io.*;

public class FileTest {
    //文件创建
    @Test
    public void test1() throws IOException {
        File file = new File("hi.txt");
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("创建成功!");
        } else {
            file.delete();
            System.out.println("删除成功!");
        }
    }

    //文件目录创建
    @Test
    public void test2(){
        File file = new File(".\\io\\io1");
        boolean mkdir = file.mkdirs();
        if (mkdir) {

            System.out.println("yes!");
        }
    }

    /**
     * file类不涉及写入或者读取文件内容的操作，要实现必须要IO流
     * file类的对象经常会作为参数写入到流的构造器中，指明读取或写入的“终点”
     */
    @Test
    public void test3() throws IOException {
        //实例化并指明操作的对象
        File file = new File("hi.txt");
        //提供具体的流
        FileReader fileReader = new FileReader(file);
        //数据的读入
        int data = fileReader.read();
        System.out.println(data);
        while (data != -1) {
            System.out.println((char) data);
            data = fileReader.read();
        }
        //流的关闭！！！
        fileReader.close();

    }
    @Test
    public void test4() throws IOException {
        //实例化并指明操作的对象
        File file = new File("hi.txt");
        //提供具体的流
        FileReader fileReader = new FileReader(file);
        //批量数据的读入
        char[] chars = new char[15];
        fileReader.read(chars);
        for (char c : chars) {
            System.out.println(c);
        }

    }

    @Test
    public void test5()  {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File srcfile = new File("hello.txt");
            File desFile = new File("hello2.txt");

            if (!srcfile.exists()) {
                srcfile.createNewFile();
            }
            if (!desFile.exists()) {
                desFile.createNewFile();
            }

            fileReader = new FileReader(srcfile);
            fileWriter = new FileWriter(desFile);

            char[] chars = new char[5];
            int len;
            while ((len = fileReader.read()) != -1) {
                //每次写出len个字符
                fileWriter.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter!=null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileReader!=null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    /**
     * 结论：
     * 1、文本文件（.txt,.java,.c,.cpp），使用字符流；
     * 非文本文件(.jpg,.mp3.avi.doc.ppt.mp4），字节流
     */
}
