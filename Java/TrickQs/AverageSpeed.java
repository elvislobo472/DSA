package Coding.Java.TrickQs;

import java.util.Scanner;

public class AverageSpeed {

    public static void averageSpeed(double[] distance, double[] time){
        double totalSpeed = 0;

        double totalTime = 0;
        for(int i = 0; i< distance.length; i++){
            totalSpeed += distance[i];
        }

        for(int i = 0; i< time.length; i++){
            totalTime += time[i];
        }


        double averageSpeed = totalSpeed / totalTime;


        System.out.println(averageSpeed);


    }

    public static void main(String[] args) {

        double[] distance = {100, 120};


        double[] time = {2.5, 2};


        averageSpeed(distance, time);




    }

}
