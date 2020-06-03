package intzuoye;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*2.	从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给
客户端。并关闭相应的连接
*/
public class TCPClient1 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket(InetAddress.getLocalHost(), 8899);
        OutputStream os = s.getOutputStream();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test1.txt"));
        byte[] b = new byte[1024];
        int len = 0;
        while ((len = bis.read(b)) != -1) {
            os.write(b, 0, len);
        }
        s.shutdownOutput();
        InputStream is = s.getInputStream();

        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String str = null;
        while ((str = br.readLine()) != null) {
            System.out.println(str);


        }
    }
}
