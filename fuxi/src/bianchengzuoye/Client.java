package bianchengzuoye;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*1.	使用基于TCP的Java Socket编程，完成如下功能：
1)	要求从客户端录入几个字符，发送到服务器端。
2)	由服务器端将接收到的字符进行输出。
3)	服务器端向客户端发出“您的信息已收到”作为响应。
4)	客户端接收服务器端的响应信息。
提示：
服务器端:PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
客户端:BufferedReader line=new BufferedReader(new InputStreamReader(System.in));
*/
public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket(InetAddress.getLocalHost(), 1122);
        OutputStream os = s.getOutputStream();
          os.write("你好我是客户端".getBytes());
        s.shutdownOutput();
        InputStream is = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        System.out.println(str);
        br.close();
        os.close();
        s.close();
    }
}
