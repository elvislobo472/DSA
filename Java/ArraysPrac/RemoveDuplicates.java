package Coding.Java.ArraysPrac;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr){
        int idx = 1;
        if(arr.length < 2){
            System.out.println("Not enough elements in the array");
        }else {


            for(int i = 1; i < arr.length; i++){

                if(arr[i] != arr[i-1]){
                    arr[idx++] = arr[i];
                }

            }



        }

        return idx;

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 5, 5, 6, 6};


        int newSize = removeDuplicates(arr);

        for(int i = 0; i < newSize; i++){
            System.out.println(arr[i]);
        }

    }

}
