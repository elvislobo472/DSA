package Coding.Java.ArraysPrac;

public class MaximumSubArraySum {

    public static int maxSubarraySum(int[] arr){

        int maxSum = 0;

        for(int start = 0; start < arr.length; start++){
            int currSum = 0;
            for(int end = start; end < arr.length; end++){

                currSum += arr[end];

                if(currSum > maxSum){

                    maxSum = currSum;

                }

            }
        }
        return maxSum;

    }


    public static void main(String[] args) {
        int[] arr = {-4, 5, 9, -2, 2, -3, -2};

        int maxSum = maxSubarraySum(arr);


        System.out.println(maxSum);



    }

}
