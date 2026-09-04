package Coding.Java.ArraysPrac;

import java.util.Arrays;

public class RotateRight {

    public static void rotateRight(int[] arr){

        int last = arr[arr.length -1];

        for(int i = arr.length -1 ; i >0 ; i--){
            arr[i] = arr[i-1 ];
        }

        arr[0] = last;


    }



    public static void rotateRightK(int[] arr, int k){

        for (int r = 0; r < k; r ++) {

            int last = arr[arr.length -1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i -1];
            }

            arr[0] = last;
        }

    }



    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};


        rotateRight(arr);

        System.out.println(Arrays.toString(arr));


        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        rotateRightK(arr1, k);

        System.out.println(Arrays.toString(arr1));

    }

}
