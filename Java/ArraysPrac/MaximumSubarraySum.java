public class MaximumSubarraySum {

    public static int maxSubArraySum(int[] arr){
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
      
        int[] arr = {3, -4, 5, 4, -1, 7, -8};

        int maxSum = maxSubArraySum(arr);


        System.out.println(maxSum);
    }

    
}
