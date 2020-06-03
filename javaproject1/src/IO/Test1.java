package IO;

import java.io.*;

public class Test1 {
    public static void main(String[] args)  {
        File file1=new File("test.txt");
        File file2 =new File("test1.txt");
        FileInputStream fis=null;
        FileOutputStream fos =null;
        try {

            fis=new FileInputStream(file1);
            fos=new FileOutputStream(file2);
            byte[] b=new byte[1024];
            //读取的字节总数
            int len=0;
            while ((len=fis.read(b))!=-1){
                fos.write(b,0,len);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
