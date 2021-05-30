package IP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * http://localhost:8080/examples/beauty.jpg?id=2
     *  协议  主机名 端口号 资源地址            参数列表
 */
public class URLTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:8080/examples/beauty.jpg?id=2");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.connect();

        InputStream is = urlConnection.getInputStream();//输入
        FileOutputStream fos = new FileOutputStream("sdsd.jpg");//写出、输出

        byte[] buffer = new byte[1024];

    }

}
