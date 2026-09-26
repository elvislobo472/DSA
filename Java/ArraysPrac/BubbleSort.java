package Coding.Java.ArraysPrac;

import java.util.Arrays;

public class BubbleSort {

    //Bubble Sort

    public static void sortedArray(int[] arr){


        for(int round = 0; round < arr.length - 1; round++) {

            for (int i = 0; i < arr.length - round - 1; i++) {  //  arr.length - i- 1, because in the first i =0 means nothing is sorted, incremented to 1, means one element is sorted (basically to reduce the number of operations)
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }




        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 7, 4, 1, 6, 9};

//        int[] arr = {7, 8, 3, 1, 2};
        sortedArray(arr);

    }
}
