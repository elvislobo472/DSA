package Coding.Java.TwoPointer;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] arr){

        int left = 0;
        int right = arr.length - 1;
        int index = arr.length - 1;

        int[] result = new int[arr.length];

        while(left <= right){

            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if(leftSquare > rightSquare){
                result[index] = leftSquare;
                left++;
            }else{
                result[index] = rightSquare;
                right--;
            }

            index--;





        }





        return result;

    }



    public static void main(String[] args) {

        int[] arr = {-7,-3,2,3,11};

        int[] result = sortedSquares(arr);

        System.out.print(Arrays.toString(result));

    }
}
