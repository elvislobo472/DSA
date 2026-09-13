package Coding.Java.ArrayListsPrac;

import java.util.ArrayList;

public class TwoSumAL {

    public static void twoSumAL(ArrayList<Integer> nino, int target){

        for(int i = 0; i < nino.size(); i++){
            for (int j = i + 1; j < nino.size(); j++ ){
                 if(nino.get(i) + nino.get(j) == target){
                     System.out.println(i +", "+ j);
                 }

            }
        }

    }


    public static void main(String[] args) {

        ArrayList<Integer> el = new ArrayList<>();


        el.add(2);
        el.add(7);
        el.add(11);
        el.add(15);
        el.add(-2);

        int target = 9;
        twoSumAL(el, target);



    }

}
