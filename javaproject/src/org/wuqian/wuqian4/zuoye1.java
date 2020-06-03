package org.wuqian.wuqian4;

// 1.获取数组最大值和最小值操作：利用Java的Math类的random()方法，编写方法得到0到100之间的10个随机数，将它们存到数组中。
//求数组中最大的数和最小的数，并统计其中>=30的有多少个。
//提示：使用 int num=(int)(n*Math.random());获取随机数
public class zuoye1 {
    public static void main(String[] args) {
        int[] arr = getArr();
        printArr(arr);
       int mx= getMax(arr);

       int mn=getMin(arr);
        System.out.println("最大值：" + mx + ",最小值：" + mn);
       int count=getCount(arr);
        System.out.println(">=30的值有"+count+"个");
    }

    //得到数组
    public static int[] getArr() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
        return arr;
    }

    //遍历数组
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

    }
    //求数组中最大的数
    public static   int getMax(int[] arr){
        //假设第一个数最大
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //求数组中最小的数
    public static int getMin(int [] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public  static int getCount(int[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=30){
                count++;
            }
        }
        return count;
    }

}
