package Coding.Java.ArrayListsPrac;

import java.util.ArrayList;

public class RemoveZeroesAL {
    public static ArrayList<Integer> removeZeroes (ArrayList<Integer> el) {
        int j = 0;

        for(int i = 0; i< el.size(); i++){


            if(el.get(i) != 0){
                if(i != j){
                    int temp = el.get(i);
                    el.set(i, el.get(j));
                    el.set(j, temp);
                }

                j++;
            }



        }


        return el;

    }


    public static void main(String[] args) {

        ArrayList<Integer> el = new ArrayList<>();


        el.add(1);
        el.add(0);
        el.add(2);
        el.add(0);
        el.add(12);
        el.add(0);
        el.add(5);


        ArrayList<Integer> lobo = removeZeroes(el);


        for(int i = 0; i < lobo.size(); i++){
            System.out.print(lobo.get(i) +" " );
        }





    }

}
