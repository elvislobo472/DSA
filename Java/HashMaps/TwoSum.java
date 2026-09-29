package Coding.Java.HashMaps;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target){

        int[] result = new int[2];
        HashMap<Integer, Integer> comp = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            if (comp.containsKey(target - arr[i])){
                result[0] = i;
                result[1] = comp.get(target - arr[i]);
            }

            comp.put(arr[i], i);


        }

        return result;



    }


    public static void main(String[] args) {

        int[] arr = {5, 2, 11, 7, 15, 3};
        int target = 9;
        int result[] = twoSum(arr, target);

        System.out.println(Arrays.toString(result));

    }

}
