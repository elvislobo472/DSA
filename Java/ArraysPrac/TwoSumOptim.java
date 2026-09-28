package Coding.Java.ArraysPrac;

import java.util.*;

public class TwoSumOptim {

    public static int[] selectSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++){
            int smallest = i;

            for (int j = i+1; j < arr.length; j++){


                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }



            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;





        }


//        System.out.println(Arrays.toString(arr));



        return arr;
    }

    public static void twoSum(int[] arr, int target){

        selectSort(arr);
        int start = 0;
        int end = arr.length-1;

        while(start < end){

            if(arr[start] + arr[end] == target){
                System.out.println(start +" "+ end);
                break;
            }else if(arr[start] + arr[end] > target){

                end--;

            }else{
                start++;

            }
        }



    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 11, 7, 15, 3};
        int target = 9;
        twoSum(arr, target);


    }


}
