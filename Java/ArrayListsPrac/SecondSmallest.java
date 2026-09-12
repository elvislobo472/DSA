package Coding.Java.ArrayListsPrac;

import java.util.*;

public class SecondSmallest {

    public static void secSmall(ArrayList<Integer> el) {
            int min1, min2 = Integer.MAX_VALUE;

            if(el.get(0) < el.get(1)){
                min1 = el.get(0);
                min2 = el.get(1);
            }else{
                min1 = el.get(1);
                min2 = el.get(0);
            }

            for(int i = 2; i < el.size(); i++){
                if(el.get(i) < min1){
                    min2 = min1;
                    min1 = el.get(i);
                } else if (el.get(i) > min1 && el.get(i) < min2) {
                    min2 = el.get(i);

                }
            }

            System.out.println(min2);

        }


        public static void main(String[] args) {
            ArrayList<Integer> el = new ArrayList<>();


            el.add(4);
            el.add(45);
            el.add(12);
            el.add(56);
            el.add(100);
            el.add(99);
            el.add(8);


            secSmall(el);



        }



}


