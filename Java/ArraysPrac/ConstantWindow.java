package Coding.Java.ArraysPrac;

public class ConstantWindow {


    public static void windowSum(int[] arr, int k){


        int sum = 0;

            //Calculates the sum of first 4 elements

            for (int i = 0; i < k; i++) {

                sum += arr[i];
            }

            System.out.println(sum);

            for (int i = k; i < arr.length; i++){
                sum = sum - arr[i - k] + arr[i];   //arr[i - k] removes the element which is not part of the window ..For eg.  in the first iteration arr[4-4] = arr[0] = -1, in the second window element arr[0] is excluded as the window slided
                System.out.println(sum);
            }



}

    public static void main(String[] args) {
         int[] arr = {-1, 2, 3, 3, 4, 5, -1};

         int k = 4;

         windowSum(arr, k);

    }

}
