package org.wuqian.test;

public class Rectangle {
    int length;
    int width;

    Rectangle(int _length, int _width) {
        length = _length;
        width = _width;
    }

    void getArea() {
        System.out.println("面积=" + length * width);
    }

    void getPer() {
        System.out.println("周长=" + (length + width) * 2);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        r1.getArea();
        Rectangle r2 = new Rectangle(10, 5);
        r2.getPer();
    }
}
