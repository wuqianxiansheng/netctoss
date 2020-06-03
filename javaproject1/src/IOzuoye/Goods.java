package IOzuoye;
/*1.  创建商品类(编号，商品名称，价格)，创建测试类1，
从键盘输入一个商品信息，将信息封装为商品对象，并将商品对象保存到文件中(使用序列化)，再创建测试类2，从文件中读取商品对象，并输出到控制台
 */

import java.io.Serializable;

public class Goods implements Serializable{

    private static final long serialVersionUID = 1572744355666048431L;
    private int id;
    private String name;
    private  int price;

    public Goods(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Goods(){}



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;

    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
