package Coding.Java.StringsPrac;

import java.util.Scanner;

public class Palindrome {

    public static boolean palindrome(String word) {
        boolean res = true;

        int end = word.length() - 1;

        for(int i = 0; i < word.length(); i++){

            if(word.charAt(i) == word.charAt(end)){
                res = true;
            }else{
                res = false;
            }

            end--;
        }


        return res;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = "";

        System.out.println("Enter the word to check:");

        word = sc.next();

        word = word.toLowerCase();



        boolean  result =palindrome(word);

        System.out.println(result);



    }
}
