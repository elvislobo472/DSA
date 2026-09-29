package Coding.Java.ArraysPrac;

public class ClosestTarget {

    public static void closeTarget(int[] arr, int target) {

        int difference = Integer.MAX_VALUE;

        int sum = 0;
        int l = 0;
        int r = arr.length -1;

        while(l < r){

            sum = arr[l] + arr[r];


            // '>' keeps the first pair encountered with the minimum difference.
            // Using '>=' would replace it with a later pair having the same difference.

            if(difference > Math.abs(target - sum)){
                difference =  Math.abs(target - sum);
                System.out.println(arr[l] + " "+ arr[r]);
            }



            if(sum < target){
                l++;
            }
            else if(sum > target){
                r--;
            }
            else{
                break;
            }

        }





    }




    public static void main(String[] args) {
        int[] arr= {1, 3, 5, 8, 10, 12};

        int target = 7;

        closeTarget(arr, target);

    }
}
