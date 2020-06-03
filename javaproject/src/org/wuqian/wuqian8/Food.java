package org.wuqian.wuqian8;
/*2.编写程序实现比萨制作。需求说明编写程序，接收用户输入的信息，选择需要制作的比萨。可供选择的比萨有：培根比萨和海鲜比萨。
实现思路及关键代码
1)	分析培根比萨和海鲜比萨
2)	定义比萨类
3)	属性：名称、价格、大小
4)	方法：展示
5)	定义培根比萨和海鲜比萨继承自比萨类
6)	定义比萨工厂类，根据输入信息产生具体的比萨对象
*/
public class Food {
   private String name;
   private int price;
   private int size;

    public Food(String name, int price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    void show(){

    }

}
