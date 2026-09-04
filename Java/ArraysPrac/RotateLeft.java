package Coding.Java.ArraysPrac;

import java.util.Arrays;

public class RotateLeft {

    public static void rotateLeft(int[] arr){

        int first = arr[0];

        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length - 1] = first;


    }



    public static void rotateLeftK(int[] arr, int k){

        for (int r = 0; r < k; r ++) {
            int first = arr[0];

            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }

            arr[arr.length - 1] = first;
        }

    }



    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};


        rotateLeft(arr);

        System.out.println(Arrays.toString(arr));


        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        rotateLeftK(arr1, 2);

        System.out.println(Arrays.toString(arr1));

    }

}
