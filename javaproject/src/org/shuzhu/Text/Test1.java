package org.shuzhu.Text;

public class Test1 {

    public static int search(int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -2;
    }


    public static void main(String[] args) {
        int[] p= new int[]{11, 22, 33, 44, 55};

        System.out.println(search(p, 33));

    }
}

