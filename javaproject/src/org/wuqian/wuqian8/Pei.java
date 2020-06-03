package org.wuqian.wuqian8;

public class Pei extends Food {
    private int gram;

    public Pei(String name, int price, int size, int gram) {
        super(name, price, size);
        this.gram = gram;
    }

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    @Override
    public void show() {
        System.out.println("名称：" + super.getName());
        System.out.println("价格：" + super.getPrice() + "元");
        System.out.println("大小：" + super.getSize() + "寸");
        System.out.println("培根克数：" + this.gram);
    }

}

