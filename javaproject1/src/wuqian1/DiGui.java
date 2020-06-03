package wuqian1;

import java.io.Console;
import java.io.IOException;

public class DiGui {
        public static void main(String[] args) {
            byte[] b = new byte[40];
            while (true) {
                try {
                    System.out.println("请输入正整数,获取其阶乘，输入over结束");
                    System.in.read(b);
                    String res = new String(b).trim();
                    if (res.equals("over")) {
                        System.out.println("程序结束");
                        break;
                    }
                    int i = Integer.parseInt(res.trim());
                    if (i <= 0){
                        continue;}
                    System.out.println(i + "!=" + getResult(i));
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (NumberFormatException ne) {
                    System.out.println("请输入正整数");
                }
            }
        }
        public static int getResult(int i) {
            return i == 1 ? i : i * getResult(i - 1);
        }
    }
