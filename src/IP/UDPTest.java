package IP;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPTest {

    @Test
    public void client() throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket();
        String str = "这是一个了不起的udp客户端";
        byte[] b = str.getBytes();
        InetAddress ip = InetAddress.getLocalHost();
        DatagramPacket datagramPacket = new DatagramPacket(b, 0, b.length, ip, 9090);//把数据封装在包里面

        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }

    @Test
    public void server() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] buffer = new byte[100];

        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

        socket.receive(packet);
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        socket.close();
    }
}
