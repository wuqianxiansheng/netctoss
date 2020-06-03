package bianchengzuoye;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*1.	使用基于TCP的Java Socket编程，完成如下功能：
1)	要求从客户端录入几个字符，发送到服务器端。
2)	由服务器端将接收到的字符进行输出。
3)	服务器端向客户端发出“您的信息已收到”作为响应。
4)	客户端接收服务器端的响应信息。
提示：
服务器端:PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
客户端:BufferedReader line=new BufferedReader(new InputStreamReader(System.in));
*/
public class Service {
    public static void main(String[] args)throws IOException {
        ServerSocket ss=new ServerSocket(1122);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);
        String str = br.readLine();
        System.out.println(str);
        OutputStream os = s.getOutputStream();
        os.write("您的信息已收到".getBytes());
        s.shutdownOutput();
        os.close();
        br.close();
        s.close();
        ss.close();
    }
}
