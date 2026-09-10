package Coding.Java.ArrayListsPrac;

import java.util.ArrayList;

public class RemoveOccurrence {


    public static void removeOccurrence(ArrayList<Integer> intList, int target) {




        for (int i = 0; i < intList.size(); i++){
            if(intList.get(i) == 4){
                intList.remove(i);
                i = 0;
            }
        }




    }


    public static void main(String[] args) {


        ArrayList<Integer> el = new ArrayList<>();

        el.add(4);
        el.add(5);
        el.add(1);
        el.add(4);
        el.add(89);
        el.add(2);
        el.add(29);
        el.add(4);
        el.add(35);

        int target = 4;






        removeOccurrence(el, target);


        for(int i = 0; i < el.size(); i++){
            System.out.print(el.get(i) + " ");
        }

        System.out.println();




    }


}
