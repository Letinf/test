package IP;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP: 唯一的标识
 * 在java中使用inetAddress类代表IP
 * IP分类： IPV4和IPV6
 */
public class InetAddressTest {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress allByName = InetAddress.getByName("192.168.10.14");
        System.out.println(allByName);//

        InetAddress allByName1 = InetAddress.getByName("www.vip.com");
        System.out.println(allByName1);//返回 域名+IP

        InetAddress s = InetAddress.getByName("127.0.0.1");
        InetAddress h = InetAddress.getLocalHost();
        System.out.println(s);

    }

}
