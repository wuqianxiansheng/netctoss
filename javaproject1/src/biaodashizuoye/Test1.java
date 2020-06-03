package biaodashizuoye;
/*1.写一个正则表达式判断一个字符串是否是ip地址
规则：一个ip地址由4个数字组成，每个数字之间用.连接。每个数字的大小是0-255
        255.189.10.37 正确
        256.189.89.9 错误
        提示：调用String类的matches()方法*/

public class Test1 {
    public static void main(String[] args) {
        String regex = "(([3-9]\\d{1})|(1\\d{1,2})|(2\\d{1})|(2[0-5]{2})).(([3-9]\\d{1})|(1\\d{1,2})|(2\\d{1})|(2[0-5]{2})).(([3-9]\\d{1})|(1\\d{1,2})|(2\\d{1})|(2[0-5]{2})).(([3-9]\\d{1})|(1\\d{1,2})|(2\\d{1})|(2[0-5]{2}))";
        String ip = "192.168.92.108";
        boolean flag = ip.matches(regex);
        System.out.println(flag ? "IP合法" : "非法的IP");

    }
}
