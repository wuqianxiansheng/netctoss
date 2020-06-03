package org.wuqian.wuqian8;

public class Hai extends Food {
    private String mixture;//配料

    public Hai(String name, int price, int size, String mixture) {
        super(name, price, size);
        this.mixture = mixture;
    }

    public String getMixture() {
        return mixture;
    }

    public void setMixture(String mixture) {
        this.mixture = mixture;
    }

    @Override
    void show() {
        System.out.println("名称："+super.getName());
        System.out.println("价格："+super.getPrice()+"元");
        System.out.println("大小："+super.getSize()+"寸");
        System.out.println("配料："+this.mixture);

    }
}
