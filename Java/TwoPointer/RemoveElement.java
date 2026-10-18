package Coding.Java.TwoPointer;

public class RemoveElement {

    public static int removeElement(int[] nums, int val){

        int p = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != val){
                nums[p++] = nums[i];
            }


        }





        return p;
    }


    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};

        int val = 3;

        System.out.println(removeElement(arr, val));


    }

}
