package Coding.Java.StringsPrac;

import java.util.Scanner;

public class StringsLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        String[] arr = new String[size];


        int totalLength = 0;

        for(int i = 0; i < size; i++){
            System.out.println("Enter String value:");
            arr[i] = sc.next();

            totalLength += arr[i].length();

        }


        System.out.println(totalLength);


    }


}
