package IO;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file1=new File("test.txt");
        File file2 =new File("test2.txt");
        FileReader fr=null;
        FileWriter fw=null;
        try {
            fr=new FileReader(file1);
             fw=new FileWriter(file2);
             char[] c=new char[1024];
             int len=0;
             while ((len=fr.read(c))!=-1){
                 fw.write(c,0,len);
                 fw.flush();
             }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fr!=null){
                fr.close();
            }
            if (fw!=null){
                fw.close();
            }
        }
    }

}
