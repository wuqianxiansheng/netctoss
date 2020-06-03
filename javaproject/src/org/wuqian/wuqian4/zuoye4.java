package org.wuqian.wuqian4;
//4.	采用折半查找的算法，在数组中查询某个数的索引，如果没有找到，返回-1
public class zuoye4 {
    public static void main(String[] args) {
        int [] arr=new int[]{11,22,33,44,55,66,77};
        int index=binarySearch(arr,44);
        System.out.println(index);

    }
    public static int binarySearch(int[] arr,int vaule){
        int min=0;
        int max=arr.length-1;

        while (true){
            int mid=(min+max)/2;
            if (arr[mid]>vaule){
                max=mid-1;
            }
            else if (arr[mid]<vaule){
                min=mid+1;
            }else{
                return mid;
            }
            if (arr[mid]>arr[max]){
                return -1;
            }
        }

    }

}
