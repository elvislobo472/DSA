package Coding.Java.ArraysPrac;

public class MaxSubArrSum {

    public static int maxSArrSum(int[] arr) {

        int maxSum = Integer.MIN_VALUE, currSum = 0;


            currSum = 0;

            for (int i = 0; i < arr.length; i++){

                currSum += arr[i];

                // resetting of currSum to 0 happens after determining the maxSum value because in case of array where all the elements are negatives, it's obvious that we will have a negative value as the answer

                if(currSum > maxSum){
                    maxSum = currSum;
                }

                if(currSum < 0){
                    currSum = 0;
                }

            }



        return maxSum;
    }

    public static void main(String[] args) {


        int[] arr = {3, -4, 5, 4, -1, 7, -8};

        int maxSum = maxSArrSum(arr);


        System.out.println(maxSum);


        int[] arr2 = {-4, 5, 9, -2, 2, -3, -2};

        int maxSum2 = maxSArrSum(arr2);


        System.out.println(maxSum2);


        int[] arr3 = {-4, -4, -4, -5, -7, -2, -8};

        int maxSum3 = maxSArrSum(arr3);


        System.out.println(maxSum3);





    }
}
