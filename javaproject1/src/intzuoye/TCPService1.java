package intzuoye;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*2.	从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给
客户端。并关闭相应的连接
*/
public class TCPService1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8899);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test4.txt"));
        byte[] b = new byte[1204];
        int len = 0;
        while ((len = is.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        OutputStream os = s.getOutputStream();
        os.write("发送成功".getBytes());
       s.shutdownOutput();
       os.close();
       bos.close();
       s.close();
       ss.close();


    }
}
