package org.wuqian.wuqian4;

/*合并数组操作：现有如下一个数组：   int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}
要求将以上数组中值为0的元素去掉，将不为0的值存入一个新的数组，生成的新数组为： int newArr [] ={1,3,4,5,6,6,5,4,7,6,7,5}
思路： 确定出不为0的个数，这样可以开辟新数组；从旧的数组之中，取出内容，并将其赋给新开辟的数组。*/
public class zuoye5 {
    public static void main(String[] args) {
        int oldArr[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int count = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] != 0) {
                count++;
            }

        }
        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < oldArr.length; i++) {

            if (oldArr[i] != 0) {
                newArr[j] = oldArr[i];
                j++;
            }



        }
        printArr(newArr);
    }

    public static void printArr(int[] newArr){
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+"\t");
        }
    }
}
