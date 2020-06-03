package IntTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test1 {
    public static void main(String[] args) throws UnknownHostException {
        //得到本机的InetAddress对象
        InetAddress ia = InetAddress.getLocalHost();
        //通过InetAddress对象的getHostAddress()方法得到IP地址值，返回值为字符串类型。
        System.out.println(ia.getHostAddress());
        //通过InetAddress对象的getHostName()方法得到主机名(或域名)，返回值为字符串类型
        System.out.println(ia.getHostName());
    }
}
