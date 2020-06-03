package biaodashizuoye;
/*
4.把一个字符串中所有的大写字母替换成*,所有小写字母替换为#,数字不变. 利用正则表达式的替换功能,replaceAll()
 */
public class Test4 {
    public static void main(String[] args) {
        String str="sdaAafghcccjkq234qql";

       String str1= str.replaceAll("[A-Z]","*");
        String s = str1.replaceAll("[a-z]", "#");
        System.out.println(s);

    }
}
