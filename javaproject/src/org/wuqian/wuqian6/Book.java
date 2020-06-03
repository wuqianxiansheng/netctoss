package org.wuqian.wuqian6;
/*
1.	以面向对象的思想，编写自定义类描述图书信息。设定属性包括：书名，作者，出版社名，价格；方法包括：信息介绍
要求：
1)	设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
2)	限定介格必须大于10，如果无效进行提示
3)	设计构造方法实现对属性赋值
4)	信息介绍方法描述图书所有信息
5)	编写测试类，测试图书类的对象及相关方法（测试数据信息自定）
运行效果图:
*/
public class Book {
    private String name;
    private String auther;
    private String comname;
    private int price;
    public Book(){

    }

    public Book(String name, String auther, String comname, int price) {
        this.name = name;
        this.auther = auther;
        this.comname = comname;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 10) {
            System.out.println("价格无效");
        } else {
            this.price = price;
        }

    }
    void show(){

        System.out.println("书名："+name);
        System.out.println("作者："+auther);
        System.out.println("出版社："+comname);
        System.out.println("价格："+price);

    }
}
