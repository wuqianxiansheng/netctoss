package IntTest;

import java.net.InetSocketAddress;

public class Test3 {
    public static void main(String[] args) {
        InetSocketAddress isa=new InetSocketAddress("www.baidu.com",8080);
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());
        System.out.println(isa.getAddress().getHostAddress());
        System.out.println(isa.getAddress().getHostName());
    }
}
