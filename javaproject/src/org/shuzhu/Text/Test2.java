package org.shuzhu.Text;

public class Test2 {
    public static void deleteElement(int[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.out.println("索引越界");
            return;
        }

        for (int i = index; i < arr.length-1 ; i++) {
            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = 0;

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        deleteElement(arr, 2);
        print(arr);

    }
}
