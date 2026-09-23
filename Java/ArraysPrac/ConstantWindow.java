package Coding.Java.ArraysPrac;

public class ConstantWindow {


    public static void windowSum(int[] arr, int k){


        int sum = 0;

            for (int i = 0; i < k; i++) {

                sum += arr[i];
            }

            System.out.println(sum);

            for (int i = k; i < arr.length; i++){
                sum = sum - arr[i - k] + arr[i];
                System.out.println(sum);
            }



}

    public static void main(String[] args) {
         int[] arr = {-1, 2, 3, 3, 4, 5, -1};

         int k = 4;

         windowSum(arr, k);

    }

}
