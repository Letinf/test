package IP;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPTest {
    //客户端
    @Test
    public void client()  {
        Socket socket = null;
        OutputStream os = null;
        try {
            //1、创建socket对象，指明ip和端口号
            InetAddress s = InetAddress.getByName("172.18.218.70");

            socket = new Socket(s,8899); //socket要同时包含ip和端口号
            //2、获取一个输出流，用于输出数据
            os = socket.getOutputStream();
            //3、写出数据的操作
            os.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            //4、资源的关闭
        } finally {
            if (os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    @Test
    public void server(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream baos = null;
        try {
            //1、创建服务端的serversocket,指明自己的端口号
            serverSocket = new ServerSocket(8899);
            //2、调用accept接受来自客户端的socket
            socket = serverSocket.accept();
            //3、获取输入流
            inputStream = socket.getInputStream();
            //4、读取输入流的数据
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[5];
            int len;
            //read方法可以不停地接收，但不知道何时结束
            while ((len = inputStream.read(buffer)) != -1) { //5个一组读入，先存在baos中
                baos.write(buffer, 0, len);//攒在一起输出
            }
            System.out.println(baos.toString());
            System.out.println("收到了来自于"+socket.getInetAddress().getHostAddress()+"的数据");
        } catch (IOException e) {
            e.printStackTrace();
            //5、关闭资源
        } finally {
            if (baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }


    }


    //例子2
    @Test
    public void client1() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
        OutputStream os = socket.getOutputStream();
        FileInputStream fis = new FileInputStream(new File("beauty.jpg"));
        byte[] buffer = new byte[1024];

    }
}
