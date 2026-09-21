package Coding.Java.TrickQs;

import java.util.Scanner;

public class ClockAngle {

    public static void findAngle(int hour, int minute) {

        if(hour < 0 || minute < 0 || hour > 23 || minute > 59){
            throw new IllegalArgumentException("Enter valid time:");

        }


        hour = hour % 12;

        double minuteAngle = minute * 6;
        double hourAngle =  (hour * 30) + (minute * 0.5);

        double angle = Math.abs(hourAngle - minuteAngle);

        angle = Math.min(angle, (360 - angle));

        System.out.println(angle);



    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hours and minutes:");

        int hour = sc.nextInt();
        int minute = sc.nextInt();


        findAngle(hour,  minute);




    }
}
