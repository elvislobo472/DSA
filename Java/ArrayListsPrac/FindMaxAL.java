package Coding.Java.ArrayListsPrac;

import java.util.*;

public class FindMaxAL {

    public static void findMax(ArrayList<Integer> intList) {

        int max = intList.get(0);


        for (int i = 1; i < intList.size(); i++){
            if(intList.get(i) > max){
                max = intList.get(i);
            }
        }

        System.out.println(max);


    }


    public static void main(String[] args) {


        ArrayList<Integer> el = new ArrayList<>();

        el.add(4);
        el.add(5);
        el.add(1);
        el.add(6);
        el.add(89);
        el.add(2);
        el.add(29);
        el.add(4);
        el.add(35);



        for(int i = 0; i < el.size(); i++){
            System.out.print(el.get(i) + " ");
        }

        System.out.println();



        findMax(el);




    }


}
