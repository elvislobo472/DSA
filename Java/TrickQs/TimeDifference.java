package Coding.Java.TrickQs;

import java.util.Scanner;

public class TimeDifference {

    public static void timeDiff(int hourOne, int minOne, int hourTwo, int minTwo){

        int timeOne = (hourOne * 60) + minOne ;

        int timeTwo = (hourTwo * 60) + minTwo;

        int difference = Math.abs(timeOne - timeTwo);
        System.out.println(difference);



    }


    public static void main(String[] args) {

        Scanner el = new Scanner(System.in);

        System.out.print("Enter Hour and Minute:" );

        int hourOne = el.nextInt();
        int minOne = el.nextInt();

        System.out.print("Enter Hour and Minute:" );

        int hourTwo = el.nextInt();
        int minTwo = el.nextInt();


        timeDiff(hourOne, minOne, hourTwo, minTwo);








    }
}
