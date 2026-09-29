package Coding.Java.ArraysPrac;

public class ClosestTarget {

    public static void closeTarget(int[] arr, int target) {

        int difference = Integer.MAX_VALUE;

        int sum = 0;
        int l = 0;
        int r = arr.length -1;

        while(l < r){

            sum = arr[l] + arr[r];



            if(difference >= Math.abs(target - sum)){   //condition will get all the pairs having same difference, just > will give the first encountered pair with the least difference
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
        int[] arr= {1, 3, 5, 7, 10, 12};

        int target = 14;

        closeTarget(arr, target);

    }
}
