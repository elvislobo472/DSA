package Coding.Java.TwoPointer;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr){

        int p = 1;

        for(int i = 1; i < arr.length; i++){

            if(arr[i-1] != arr[i]){
                arr[p++] = arr[i];
            }


        }






        return p;
    }


    public static void main(String[] args) {

        int[] arr = {1, 1, 2};

        int result = removeDuplicates(arr);

        System.out.println(result);



    }



}
