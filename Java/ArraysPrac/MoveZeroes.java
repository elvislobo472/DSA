package Coding.Java.ArraysPrac;

import java.util.Arrays;

public class MoveZeroes {

    public static int[] moveZero(int[] arr){
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                j++;
            }

        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 3, 12, 2, 0, 9};

        moveZero(arr);

        System.out.println(Arrays.toString(arr));
    }

}
