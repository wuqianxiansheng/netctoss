package IO;

import java.io.*;

public class Test4 {
    public static void main(String[] args)throws IOException {
        FileReader fr=new FileReader("C:/Users/马骞/Desktop/1.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("test3.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        String str=null;
        while((str=br.readLine())!=null){
            bw.write(str);
            bw.flush();
            bw.newLine();
        }
        bw.close();
    }

}
