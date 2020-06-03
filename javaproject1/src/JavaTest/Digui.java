package JavaTest;

//1.	编写递归算法程序：一列数的规则如下: 0、1、1、2、3、5、8、13、21、34...... 求数列的第40位数是多少。（8分）
public class Digui {
    public long diGui(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        return diGui(n - 1) + diGui(n - 2);


    }

    public static void main(String[] args) {
        //int n = 40;

        Digui d = new Digui();
        long result=d.diGui(40);


        System.out.println("结果："+result);
    }
}
