package Coding.Java.TrickQs;

public class AngleBetween {


    public static int findAngle(int a, int b){


        if (a < 0 || a > 360 || b < 0 || b > 360) {
            throw new IllegalArgumentException("Angles must be between 0 and 360");
        }


        int difference = Math.abs(a - b);


        return Math.min(difference, 360-difference);


    }


    public static void main(String[] args) {
        int a = 95;
        int b = 200;


        int angle = findAngle(a, b);


        System.out.println(angle);
    }

}
