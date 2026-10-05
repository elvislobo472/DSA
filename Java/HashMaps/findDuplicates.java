package Coding.Java.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class findDuplicates {

    public static void findDuplicates(int[] arr){

        HashMap<Integer, Integer> dup = new HashMap<>();


        for(int i = 0; i < arr.length; i++){

            dup.put(arr[i], dup.getOrDefault(arr[i], 0) + 1);



        }



        for(Map.Entry<Integer, Integer> duplicate : dup.entrySet()){
            if(duplicate.getValue() > 1){
                System.out.println(duplicate.getKey());
            }
        }

//        for (int i = 0; i < arr.length; i++){
//
//            if (dup.get(arr[i]) > 1){
//                System.out.println(arr[i]);
//            }
//
//        }


    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 1, 6, 3};

        findDuplicates(arr);

    }
}
