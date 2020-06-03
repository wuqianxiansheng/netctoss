package org.wuqian.wuqian_1;

public class Test1 {
    int length;
    int width;
    double r;

    Test1(int _length, int _width) {
        length = _length;
        width = _width;

    }

    Test1(double _r) {
        r = _r;

    }

    void cfxArea() {

        System.out.println("长方形面积=" + length * width);
    }

    void zfxArea() {
        System.out.println("正方形面积=" + length * width);
    }

    void yuanArea() {
        System.out.println("圆面积=" + (3.141592654 * r * r));
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1(10, 5);
        t1.cfxArea();
        Test1 t2 = new Test1(10, 10);
        t2.zfxArea();
        Test1 t3 = new Test1(5.5);
        t3.yuanArea();
    }
}

