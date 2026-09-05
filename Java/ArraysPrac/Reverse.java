package Coding.Java.ArraysPrac;

import java.util.Arrays;

public class Reverse {


    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;


        swap(arr, start, end);



    }


    public static void swap(int[] arr, int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;


            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 15, 20, 45, 1, 25, 12};


        reverse(arr);


        System.out.println(Arrays.toString(arr));
    }
}
