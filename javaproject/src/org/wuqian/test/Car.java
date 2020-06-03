package org.wuqian.test;

public class Car {
    String colour;
    int weight;
    String model;//型号
    String length;//长度
    int height;//高度

    Car(String _colour, int _weight, String _model, String _length, int _height) {
        colour = _colour;
        weight = _weight;
        model = _model;
        length = _length;
        height = _height;
    }

    void move() {
        System.out.println("汽车移动");
    }

    void stop() {
        System.out.println("汽车静止");
    }

    void inform() {
        System.out.println("颜色：" + colour + "  重量：" + weight + "  型号：" + model + "  长度：" + length + "  高度：" + height);
    }

    public static void main(String[] args) {
        Car c = new Car("白色", 100, "001", "3M", 1);
        c.inform();
        c.move();
        c.stop();
    }

}
