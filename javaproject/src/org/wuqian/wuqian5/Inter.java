package org.wuqian.wuqian5;

/*3.	构造方法与重载：定义一个网络用户类，要处理的信息有用户 ID、用户密码、 email 地址。
在建立类的实例时把以上三个信息都作为构造方法的参数传入，
其中用户 ID 和用户密码是必须的，缺省的email地址是用户 ID 加上字符串"@gameschool.com"。
 */
public class Inter {
    String ID;
    int password;
    String email;



    public Inter(String ID, int password, String email) {
        this.ID = ID;
        this.password = password;
        this.email = email;
    }
    public Inter(String ID, int password) {
        this.ID = ID;
        this.password = password;
        this.email =ID+"@gameschool.com";
    }

    void display() {
        System.out.println("ID:" + ID +"\t密码" +password + "\temail:" + email);
    }

    public static void main(String[] args) {
        Inter inter = new Inter("哈哈", 123456);
        inter.display();


    }
}
