package Coding.Java.ArrayListsPrac;

import java.util.ArrayList;

public class SecondLargest {

    public static void secLarge(ArrayList<Integer> el) {
        int max1 = 0, max2 = 0;

        if(el.get(0) > el.get(1)){
            max1 = el.get(0);
            max2 = el.get(1);
        }else{
            max1 = el.get(1);
            max2 = el.get(0);
        }

        for(int i = 2; i < el.size(); i++){
            if(el.get(i) > max1){
                max2 = max1;
                max1 = el.get(i);
            } else if (el.get(i) < max1 && el.get(i) > max2) {
                max2 = el.get(i);

            }
        }

        System.out.println(max2);

    }


    public static void main(String[] args) {
        ArrayList<Integer> el = new ArrayList<>();


        el.add(4);
        el.add(45);
        el.add(12);
        el.add(56);
        el.add(100);
        el.add(99);


        secLarge(el);



    }



}
