package biaodashizuoye;
/*
2.用正则表达式验证一个字符串是否是合法的电子邮箱，
  规则：只允许英文字母、数字、下划线、以及中划线组成，并以.com结尾
 举例：zhangsan-001@gmail.com
提示：调用String类的matches()方法
 */
public class Test2 {
    public static void main(String[] args) {
        String str="zhangsan-001@gmail.com";
        String regex="[[a-z][A-Z][0-9]_|]+.com";
        boolean b = str.matches(regex);
        System.out.println(b);
    }
}
