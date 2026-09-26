package Coding.Java.ArraysPrac;

public class MaximumSubArraySum {

    public static int maxSubarraySum(int[] arr){

        int maxSum = arr[0];  //in this approach we need to assign to first element because of the if condition, due to negative values

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
        int[] arr = {2, 4, 5, 9 , -2, -9, 4};

        int maxSum = maxSubarraySum(arr);


        System.out.println(maxSum);


        int[] arr2 = {-4, 5, 9, -2, 2, -3, -2};

        int maxSum2 = maxSubarraySum(arr2);


        System.out.println(maxSum2);


        int[] arr3 = {-4, -4, -4, -5, -7, -2, -8};

        int maxSum3 = maxSubarraySum(arr3);


        System.out.println(maxSum3);



    }

}
