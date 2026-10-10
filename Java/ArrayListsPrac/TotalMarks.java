package Coding.Java.ArrayListsPrac;

import java.util.ArrayList;

public class TotalMarks {


    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(5);




        marks.add(72);
        marks.add(85);
        marks.add(90);
        marks.add(64);
        marks.add(78);


        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        int aboveAverage = 0;

        for(int i = 0; i < marks.size(); i++){
            sum += marks.get(i);

            if(marks.get(i) > highest){
                highest = marks.get(i);
            }

            if(marks.get(i) < lowest){
                lowest = marks.get(i);
            }

        }


        double average = (double) sum / marks.size();

        for(int i = 0; i < marks.size(); i++){


            if(marks.get(i) > average){
                aboveAverage++ ;
            }


        }






        System.out.println(sum);
        System.out.println(average);

        System.out.println("Highest: "+ highest + " Lowest: " + lowest);

        System.out.println("Above Average Scores: " +aboveAverage);


    }
}
