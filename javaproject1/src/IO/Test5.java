package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test5 {
}
 class BufferedByteDemo {
    public static void main(String[] args) throws IOException {
        // 指定目的地
        FileInputStream fis = new FileInputStream("test1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len = 0;
        byte[] by = new byte[1024];
        StringBuilder sb = new StringBuilder();
        // 取数据
        while((len = bis.read(by)) != -1) {
            //sb.append(new String(by, 0, len));
            String s=new String(by,0,len);
           System.out.println(sb.append(s));

        }
       // System.out.println(sb);
        // 关闭流
        bis.close();
    }
}

