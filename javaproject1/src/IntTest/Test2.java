package IntTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

//根据域名得到InetAddress对象
public class Test2 {
    public static void main(String[] args) {
        try {
            InetAddress ia=InetAddress.getByName("www.baidu.com");

            System.out.println( ia.getHostAddress());
            System.out.println(ia.getHostName());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
