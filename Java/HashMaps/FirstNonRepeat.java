package Coding.Java.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeat {



    public static void firstNonRepeat(int[] arr){
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            count.put(arr[i], count.getOrDefault(arr[i], 0)+1);
        }



       for(Map.Entry(Integer , Integer) nums : count. )



    }


    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 1, 4, 5, 2, 7};


        firstNonRepeat(arr);

    }

}
