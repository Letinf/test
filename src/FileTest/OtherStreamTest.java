package FileTest;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class OtherStreamTest {
    /**
     * 标准输入输出流
     * system.in
     * system.out
     */

    public static void main(String[] args){


        BufferedReader br = null;//缓冲流
        try {
            InputStreamReader isr = new InputStreamReader(System.in);//转换流，得到字符流
            br = new BufferedReader(isr);

            while (true){
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
                    break;
                }
                String upp = data.toUpperCase(Locale.ROOT);
                System.out.println(upp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
