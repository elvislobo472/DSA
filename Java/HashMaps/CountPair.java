package Coding.Java.HashMaps;

import java.util.HashMap;

public class CountPair {

    public static void countPair(int[] arr, int target){
        HashMap<Integer, Integer> pairs = new HashMap<>();

        int count = 0;
         int diff = 0;

        for(int i = 0; i < arr.length; i++){

           diff = target - arr[i];

           count += pairs.getOrDefault(diff, 0);

           pairs.put(arr[i], pairs.getOrDefault(arr[i], 0)+1);

        }

        System.out.println(count);

    }


    public static void main(String[] args) {


        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;


        countPair(arr, target);
    }
}
