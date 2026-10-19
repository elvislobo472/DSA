package Coding.Java.TwoPointer;

import java.util.Arrays;

public class MoveZeroes {


//    public static void moveZeroes(int[] arr){
//
//        int j = 0;
//
//        for(int i=0; i < arr.length; i++){
//
//            if(arr[i] != 0){
//                if(i != j){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//                j++;
//            }
//
//
//
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//    }




    public static void moveZeroes(int[] arr){

        int id = 0;

        for(int i=0; i < arr.length; i++){

            if(arr[i] != 0){
                arr[id++] = arr[i];

            }


        }


        while(id < arr.length){
            arr[id++] = 0;
        }

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        moveZeroes(arr);


    }
}
