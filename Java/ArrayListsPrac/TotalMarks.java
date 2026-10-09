package Coding.Java.ArrayListsPrac;

import java.util.ArrayList;
import java.util.Scanner;

public class TotalMarks {


    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(5);

        Scanner sc = new Scanner(System.in);

//        for(int i = 0; i < 5; i++){  //Can't put marks.size() as it resolves to 0
//            int data = sc.nextInt();
//            marks.add(data);
//
//        }

        marks.add(72);
        marks.add(85);
        marks.add(90);
        marks.add(64);
        marks.add(78);


        float sum = 0;
        int highest = 0;
        int lowest = Integer.MAX_VALUE;

        for(int i = 0; i < marks.size(); i++){
            sum += marks.get(i);

            if(marks.get(i) > highest){
                highest = marks.get(i);
            }

            if(marks.get(i) < lowest){
                lowest = marks.get(i);
            }

        }

        float average = sum / marks.size();



        System.out.println(sum);
        System.out.println(average);

        System.out.println("Highest: "+ highest + " Lowest: " + lowest);




    }
}
