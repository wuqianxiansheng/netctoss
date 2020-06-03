package org.wuqian.wuqian4;

//3.	完成数组int[] a = {100,40, 60, 87, 34, 11, 56, 0}的冒泡排序；
public class zuoye3 {
    public static void main(String[] args) {
        int[] arr = new int[]{100, 40, 60, 87, 34, 11, 56, 0};
        sort(arr);
        print(arr);

    }

    public static void sort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //本趟循环还没有把相邻的元素排好，推翻之前的假设
                    flag = false;
                }

            }
            if (flag) {
                //结束外层循环
                break;
            }
            count++;
        }

        System.out.println("共执行了"+count+"次");
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
