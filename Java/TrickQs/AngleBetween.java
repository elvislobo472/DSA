package Coding.Java.TrickQs;

public class AngleBetween {


    public static int findAngle(int a, int b){

        int difference = Math.abs(a - b);


        return 360-difference;


    }


    public static void main(String[] args) {
        int a = 95;
        int b = 200;


        int angle = findAngle(a, b);


        System.out.println(angle);
    }

}
