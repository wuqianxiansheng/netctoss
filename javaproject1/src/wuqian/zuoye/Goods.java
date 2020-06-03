package wuqian.zuoye;
//2.	使用HashSet存储多个商品信息，遍历并输出；其中商品属性：编号，名称，单价，出版社；要求向其中添加多个相同的商品，验证集合中元素的唯一性。
//提示：向HashSet中添加自定义类的对象，需要重写类的hashCode和equals( )

public class Goods {
    private  int id;
    private  String name;
    private  int price;
    private  String publisher;

    public Goods(int id, String name, int price, String publisher) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.publisher = publisher;
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

    public String getPublisher() {
        return publisher;
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

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+id+price+publisher.hashCode();
    }



    @Override
    public boolean equals(Object obj) {
        if (this==obj){
        return true;

        }


        return super.equals(obj);
    }


    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
