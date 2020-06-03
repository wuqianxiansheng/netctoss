package org.wuqian.wuqian4;

public class zuoye2 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33, 44, 55};
        int[] newArr = reverseOrderArray(arr);
        reverseOrderArray(arr);

        print(newArr);
    }


    public static int[] reverseOrderArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
        return newArr;

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
