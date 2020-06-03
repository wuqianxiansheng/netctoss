package wuqian.zuoye;
//1.	使用List集合存放多个图书信息，分别使用for循环和迭代器遍历集合，输出每个图书信息。其中图书属性：编号，名称，单价，出版社。
public class Book {
    private int id;
    private  String name;
    private  int price;
    private String press;

    public Book(int id, String name, int price, String press) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.press = press;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getPress() {
        return press;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                '}';
    }
}
