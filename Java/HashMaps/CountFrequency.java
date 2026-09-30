package Coding.Java.HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class CountFrequency {



    public static void countFrequency(int[] arr){

        HashMap<Integer, Integer> frequency = new HashMap<>();


        for(int i=0; i< arr.length; i++){
            frequency.put(arr[i], frequency.getOrDefault(arr[i], 0) + 1);

        }


        System.out.println(frequency);

    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 5, 5, 6, 6};


        countFrequency(arr);



    }

}
