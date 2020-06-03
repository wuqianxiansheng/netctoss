package fuxiti2;

/*1.	给20块钱买可乐，每瓶可乐3块钱，喝完之后退瓶子可以换回1块钱，问最多可以喝到多少瓶可乐。*/
public class Cola {
    private int money = 20;
    private int count = 0;

    public void sell() {
        boolean flag = true;
        while (flag) {
            if (money >= 3) {
                money -= 2;
                count++;
            } else {
                break;
            }

        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.sell();
    }
}
