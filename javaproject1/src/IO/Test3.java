package IO;

import java.io.*;

public class Test3 {
    public static void main(String[] args)throws IOException {
        long start=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("C:/Users/马骞/Pictures/Camera Roll/11.jpg");
         FileOutputStream fos=new FileOutputStream("D:/wuqian.jpg");
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream  bos=new BufferedOutputStream(fos);
        int len=0;
        byte[] b=new byte[1024];
        while ((len=bis.read(b))!=-1){
            bos.write(b,0,len);
            bos.flush();
        }
        bis.close();
        bos.close();
        long end =System.currentTimeMillis();
        System.out.println("花费时间"+(end-start) +"毫秒");
    }
}
