package Coding.Java.TwoPointer;



public class TwoSumOne {

    public static int[] twoSum(int[] arr, int target){

        int r = arr.length -1;
        int l = 0;


        while(l < r){
            if(arr[l] + arr[r] == target){

                return new int[]{l+1, r+1};  //If the solution doesn't want zero-indexed answer

            } else if (arr[l] + arr[r] < target) {
                l++;
            }else{
                r--;
            }
        }



        return new int[]{-1, -1};

    }


    public static void main(String[] args) {
       int[] arr = {2, 7, 11, 15, 22, 4, 12 };

       int target = 14;

       int[] result = twoSum(arr, target);
       System.out.println(
               "[" + result[0] + ", " + result[1] + "]"
       );

    }

}
