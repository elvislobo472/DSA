package Coding.Java.ArrayListsPrac;

import java.util.ArrayList;

public class SafeHighest {


    public static int highest(ArrayList<Integer> sf) {

        if(sf.isEmpty()){
            System.out.println("The list is empty");

            return -1;
        }else {

            int highest = sf.get(0);

            for(int i = 1; i < sf.size(); i++){

                if(sf.get(i) > highest){
                    highest = sf.get(i);
                }
            }

            return highest;
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> sf = new ArrayList<>();

        sf.add(72);
        sf.add(35);
        sf.add(90);
        sf.add(28);
        sf.add(64);
        sf.add(31);


        int highScore = highest(sf);

        System.out.println(highScore);
        
        
    }
    
}
