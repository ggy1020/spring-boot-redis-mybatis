package com.demo.arithmetic;

/**
 * 选择排序
 */
public class SelectSort_20210817 {
    public static void main(String[] args) {
      int[] aa = { 4,54,4,5,8,0,1,4,7};
      printSort(aa);
     //  selectSort(aa);
     //   bubbleSort(aa);
       // insertSort(aa);
        insertSort2(aa);
        System.out.println();
        printSort(aa);
    }

    /**
     * 冒泡排序 每次与相近的进行比较排序
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length < 2 ){
            return;
        }
        for (int j = 0 ; j < arr.length ; j ++) {
            for (int i = 0 ; i < arr.length -j -1 ; i ++){
                if (arr[i] > arr[i + 1]){
                        swap(i,i + 1,arr);
                }
            }
        }
    }

    /**
     * 插入排序 每次与相近的进行比较排序
     * @param arr
     */
    public static void insertSort(int[] arr){
        if (arr == null || arr.length < 2 ){
            return;
        }
        for (int j = 1 ; j < arr.length ; j ++) {
            for (int i = j - 1 ;  i >=0 && arr[i] > arr[i + 1] ; i --){
                swap(i +1,i,arr);
            }
        }
    }

    /**
     * 插入排序 每次与相近的进行比较排序
     * @param arr
     */
    public static void insertSort2(int[] arr){
        if (arr == null || arr.length < 2 ){
            return;
        }
        for (int j = 1 ; j < arr.length ; j ++) {
            int i = j - 1 ;
            while (i  >=0 && arr[i] > arr[i + 1]  ){
                swap(i +1,i,arr);
                i --;
            }
        }
    }


    public static  void printSort(int[] arr){
        for (int j = 0 ; j <  arr.length ; j ++) {
            System.out.print(arr[j] +"  ");
        }
    }

    /**
     * 选择排序
     * @param arr
     */
    public static  void selectSort(int[] arr){
        if (arr == null || arr.length < 2 ){
            return;
        }
        for (int j = 1 ; j < arr.length ; j ++) {
            int temp = j;
            for (int i = j+1 ; i < arr.length ; i ++){
                if (arr[temp] > arr[i]){
                    temp = i;
                }
            }
            if (j != temp){
                 swap(temp,j,arr);
            }
        }
    }

    private static void swap(int temp, int j, int[] arr) {
        int c = arr[j];
        arr[j] = arr[temp];
        arr[temp] = c;
    }
}
